/*
 * *
 *  * Copyright 2015 IBM Corp. All Rights Reserved.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.ibm.watson.developer_cloud.concept_insights.v2.model;

import java.util.List;

import com.ibm.watson.developer_cloud.concept_insights.v2.ConceptInsights;

/**
 * Graphs returned by the {@link ConceptInsights} service.
 * 
 */
public class Corpus {

	/** The access. */
	private String access;

	/** The id. */
	private String id;

	/** The users. */
	private List<User> users;

	/**
	 * Gets the access.
	 * 
	 * @return The access
	 */
	public String getAccess() {
		return access;
	}

	/**
	 * Gets the id.
	 * 
	 * @return The id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Gets the users.
	 * 
	 * @return The users
	 */
	public List<User> getUsers() {
		return users;
	}

	/**
	 * Sets the access.
	 * 
	 * @param access
	 *            The access
	 */
	public void setAccess(String access) {
		this.access = access;
	}

	/**
	 * Sets the id.
	 * 
	 * @param id
	 *            The id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Sets the users.
	 * 
	 * @param users
	 *            The users
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}

	/**
	 * With access.
	 * 
	 * @param access
	 *            the access
	 * @return the corpus
	 */
	public Corpus withAccess(String access) {
		this.access = access;
		return this;
	}

	/**
	 * With id.
	 * 
	 * @param id
	 *            the id
	 * @return the corpus
	 */
	public Corpus withId(String id) {
		this.id = id;
		return this;
	}

	/**
	 * With users.
	 * 
	 * @param users
	 *            the users
	 * @return the corpus
	 */
	public Corpus withUsers(List<User> users) {
		this.users = users;
		return this;
	}

}
