/*
 * Copyright 2013 Maksym Borodin <borodin.maksym@gmail.com>
 * http://www.github.com/mborodin
 *
 * See the NOTICE.md file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
package com.github.mborodin.course

object ControlStructures extends App with Logging{
  val lang = args[0]
  val hello = if(lang == "cz" ) "Dobrý den"
              else if (lang == "am") "Բարի օր" // no else statement means else (), where () has type Unit and treated as "Nothing useful"

  println(hello)
  
}

