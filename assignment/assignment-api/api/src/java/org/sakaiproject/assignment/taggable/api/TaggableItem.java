/**********************************************************************************
 * $URL$
 * $Id$
 ***********************************************************************************
 *
 * Copyright (c) 2006 The Sakai Foundation.
 *
 * Licensed under the Educational Community License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.opensource.org/licenses/ecl1.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakaiproject.assignment.taggable.api;

/**
 * An object related to a tagged activity. For example, when tagging an
 * assignment, the items would be submissions for the assignment.
 * 
 * @author The Sakai Foundation.
 */
public interface TaggableItem {

	/**
	 * @return A reference for this item.
	 */
	public String getReference();

	/**
	 * @return A title for this item.
	 */
	public String getTitle();

	/**
	 * @return The content of this item.
	 */
	public String getContent();

	/**
	 * @return The identifier of the user that created/owns this item.
	 */
	public String getUserId();

	/**
	 * @return The activity to which this item belongs.
	 */
	public TaggableActivity getActivity();
}
