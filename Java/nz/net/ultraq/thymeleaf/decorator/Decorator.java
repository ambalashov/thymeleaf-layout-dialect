/*
 * Copyright 2013, Emanuel Rabina (http://www.ultraq.net.nz/)
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

package nz.net.ultraq.thymeleaf.decorator;

import org.thymeleaf.dom.Element;

/**
 * Interface for all decorators.
 * 
 * @author Emanuel Rabina
 */
public interface Decorator {

	/**
	 * Apply the contents of the decorator element to the content element.
	 * 
	 * @param decorator Element from the decorator template to bring in to the
	 * 					content template which is currently being processed.
	 * @param content	Element from the content template.
	 */
	public void decorate(Element decorator, Element content);
}
