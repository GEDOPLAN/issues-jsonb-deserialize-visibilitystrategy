package de.gedoplan.whatsnewinjee8.entity;

import de.gedoplan.whatsnewinjee8.json.bind.JsonAccessType;

import javax.json.bind.annotation.JsonbVisibility;

@JsonbVisibility(JsonAccessType.AllFieldsVisibilityStrategy.class)
public class Country {

  private String name;

  public String getName() {
    return this.name;
  }

  protected Country() {
  }

  public Country(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Country [name=" + this.name + "]";
  }

}
