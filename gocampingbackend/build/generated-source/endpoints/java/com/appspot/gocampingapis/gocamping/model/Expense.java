/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-04-08 17:16:44 UTC)
 * on 2016-04-19 at 05:50:15 UTC 
 * Modify at your own risk.
 */

package com.appspot.gocampingapis.gocamping.model;

/**
 * Model definition for Expense.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the gocamping. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Expense extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long familyId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double itemCost;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String itemName;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * @param description description or {@code null} for none
   */
  public Expense setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getFamilyId() {
    return familyId;
  }

  /**
   * @param familyId familyId or {@code null} for none
   */
  public Expense setFamilyId(java.lang.Long familyId) {
    this.familyId = familyId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public Expense setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getItemCost() {
    return itemCost;
  }

  /**
   * @param itemCost itemCost or {@code null} for none
   */
  public Expense setItemCost(java.lang.Double itemCost) {
    this.itemCost = itemCost;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getItemName() {
    return itemName;
  }

  /**
   * @param itemName itemName or {@code null} for none
   */
  public Expense setItemName(java.lang.String itemName) {
    this.itemName = itemName;
    return this;
  }

  @Override
  public Expense set(String fieldName, Object value) {
    return (Expense) super.set(fieldName, value);
  }

  @Override
  public Expense clone() {
    return (Expense) super.clone();
  }

}
