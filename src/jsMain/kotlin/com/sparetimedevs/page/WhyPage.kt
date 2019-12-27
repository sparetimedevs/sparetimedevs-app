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

package com.sparetimedevs.page

import com.sparetimedevs.page.content.WHY_HEADING
import com.sparetimedevs.page.content.WHY_PARAGRAPH
import com.sparetimedevs.page.util.asHeading
import com.sparetimedevs.page.util.asParagraph
import org.w3c.dom.HTMLDivElement

class WhyPage(
    private val contentDiv: HTMLDivElement
) {

    init {
        show()
    }

    private fun show() {
        contentDiv.appendChild(WHY_HEADING.asHeading())
        contentDiv.appendChild(WHY_PARAGRAPH.asParagraph())
    }
}
