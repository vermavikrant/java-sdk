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

import java.util.ArrayList;
import java.util.List;

import com.ibm.watson.developer_cloud.concept_insights.v2.ConceptInsights;
import com.ibm.watson.developer_cloud.util.GsonSingleton;

/**
 * Accounts returned by the {@link ConceptInsights} service.
 * 
 */
public class Accounts {
	/** The accounts. */
	private List<Account> accounts = new ArrayList<Account>();

	/**
	 * Gets the accounts.
	 * 
	 * @return The accounts
	 */
	public List<Account> getAccounts() {
		return accounts;
	}

	/**
	 * Sets the accounts.
	 * 
	 * @param accounts
	 *            The accounts
	 */
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getClass().getName() + " " + GsonSingleton.getGson().toJson(this);
	}

	/**
	 * With accounts.
	 * 
	 * @param accounts
	 *            the accounts
	 * @return the accounts
	 */
	public Accounts withAccounts(List<Account> accounts) {
		this.accounts = accounts;
		return this;
	}
}
