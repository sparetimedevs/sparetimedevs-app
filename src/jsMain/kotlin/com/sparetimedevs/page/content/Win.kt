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

package com.sparetimedevs.page.content

const val WIN_HEADING =
"""WIN
"""

const val WIN_PARAGRAPH =
"""WIN is an application. WIN is short for “Who is next?” and is an application to determine who is next to do something.
<br>
Imagine you have a monthly dinner event with friends. Every month a friend from this group cooks and every time someone 
else cooks. To follow a static list would be too strict. But doing it on a voluntary basis, can mean only three friends 
will volunteer to cook. The WIN application offers a solution. Fill in all candidates of your dinner events. Roll some 
<i>virtual</i> dice and determine who is next!
<br>
<br>
For who is WIN?
<br>
Who’s going to give the next presentation? WIN!
<br>
Who’s going to get the next round of drinks? WIN!
<br>
Who’s going to host the next barbecue? WIN!
<br>
Who wins? WIN!
<br>
<br>
Technology stack:
<pre>
- Cloud computing utilising Azure
    - Serverless
        - Azure CDN
        - Static website (hosted via Azure Storage)
            - HTML
            - CSS
            - Kotlin JavaScript
        - Azure API Management
        - Azure Functions
            - Kotlin JVM
            - Arrow
            - suspendmongo
    - DBaaS
        - MongoDB Atlas
</pre>
<!-- insert application landscape image -->
<br>
Local development environment:
<pre>
- Git
- Powershell
    - with the Azure PowerShell module installed
- Docker
- JDK 8
- Maven 3
- Azure Functions Core Tools
- Intellij
- Visual Studio Code
- MongoDB Compass (Community Edition)
</pre>
<br>
Why is this a fun project to work on? Because the core concept is easy to set up, while there still are a lot of 
possibilities to extend on this core. Think of more ways to determine who is next (draw the short straw, flip a coin, 
etc.). Create clients for all kind of devices (iPhone app, Android app, desktop app, etc). More management options 
(change a date or a candidate).
"""
