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

package com.sparetimedevs.page.util

import org.w3c.dom.HTMLHeadingElement
import org.w3c.dom.HTMLParagraphElement
import kotlin.browser.document

fun String.asHeading(): HTMLHeadingElement {
    val heading: HTMLHeadingElement = document.createElement("h2") as HTMLHeadingElement
    heading.innerHTML = this
    return heading
}

fun String.asParagraph(): HTMLParagraphElement {
    val paragraph: HTMLParagraphElement = document.createElement("p") as HTMLParagraphElement
    paragraph.innerHTML = this
    return paragraph
}
