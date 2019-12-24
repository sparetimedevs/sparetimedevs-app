plugins {
    kotlin("multiplatform") version "1.3.61"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.3.61"
    id("kotlin-dce-js") version "1.3.61"
}

repositories {
    jcenter()
}

kotlin {
    js {
        browser {
            webpackTask {
                sourceMaps = false // Set 'true' if need debug
                report = true // Enable execute tests src/jsTest
            }
            testTask {
                useKarma {
                    useChromeHeadless()
                    usePhantomJS()
                }
            }
        }
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
        val jsTest by getting {
            dependsOn(jsMain)
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}

val PRODUCTION_DIR = "build/production"
tasks {
    named("jsBrowserRun") {
        dependsOn("runDceJsKotlin")
    }
    named("jsBrowserWebpack") {
        dependsOn("runDceJsKotlin")
    }
    named("jsBrowserTest") {
        dependsOn("runDceJsKotlin")
    }
    register("buildProduction", Copy::class.java) {
        setDescription("generate directory $PRODUCTION_DIR")
        dependsOn("jsBrowserWebpack")
        dependsOn("jsBrowserTest")
        from("build/distributions") {
            include("*.js")
        }
        from("src/jsMain/resources")
        into(PRODUCTION_DIR)
    }
    register("runProduction") {
        setDescription("run simple web server with content: $PRODUCTION_DIR")
        dependsOn("buildProduction")
        doLast {
            val port = 8081
            SimpleHttpFileServerFactory().start(file(PRODUCTION_DIR), port)
            println("Open http://localhost:$port/index.html")
            Thread.sleep(Long.MAX_VALUE)
        }
    }
    named("build") {
        dependsOn("buildProduction")
    }
}
