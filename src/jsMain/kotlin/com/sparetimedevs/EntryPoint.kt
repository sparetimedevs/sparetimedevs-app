/*
 * Copyright (c) 2019 sparetimedevs and respective authors and developers.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sparetimedevs

import com.sparetimedevs.page.IndexPage
import com.sparetimedevs.page.WhatPage
import com.sparetimedevs.page.WhoPage
import com.sparetimedevs.page.WhyPage
import org.w3c.dom.HTMLAnchorElement
import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLImageElement
import kotlin.browser.document
import kotlin.browser.window
import kotlin.dom.addClass

fun main() {
    val rootDiv: HTMLDivElement? = document.getElementById("root") as HTMLDivElement?

    rootDiv?.appendChild(createHeaderDiv()) ?: return

    val contentDiv: HTMLDivElement = document.createElement("div") as HTMLDivElement
    contentDiv.addClass("content", "content-children")
    rootDiv.appendChild(contentDiv)

    when (window.location.pathname) {
        "/index.html" -> IndexPage(contentDiv)
        "/what.html" -> WhatPage(contentDiv)
        "/who.html" -> WhoPage(contentDiv)
        "/why.html" -> WhyPage(contentDiv)
        else -> window.location.href = "index.html"
    }
}

private fun createHeaderDiv(): HTMLDivElement {
    val headerDiv: HTMLDivElement = document.createElement("div") as HTMLDivElement
    headerDiv.addClass("header")

    headerDiv.appendChild(createLogo())

    headerDiv.appendChild(createButton("What", "what.html"))
    headerDiv.appendChild(createButton("Who", "who.html"))
    headerDiv.appendChild(createButton("Why", "why.html"))
    return headerDiv
}

private fun createLogo(): HTMLAnchorElement {
    val logoAnchor: HTMLAnchorElement = document.createElement("a") as HTMLAnchorElement
    logoAnchor.href = "index.html"
    logoAnchor.addClass("logo")

    val imageElement = document.createElement("img") as HTMLImageElement
    imageElement.src = "sparetimedevs_header_logo.png"
    logoAnchor.appendChild(imageElement)

    return logoAnchor
}

private fun createButton(label: String, href: String): HTMLButtonElement {
    val buttonElement: HTMLButtonElement = document.createElement("button") as HTMLButtonElement
    buttonElement.innerHTML = label
    buttonElement.addEventListener("click", {
        window.location.href = href
    })
    buttonElement.addClass("view-details", "ripple", "float-right")
    return buttonElement
}
