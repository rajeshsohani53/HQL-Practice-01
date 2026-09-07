package com.rajesh.Entity;

public class Festival {
  private Integer id;
  private String name;
  private String description;
  private String month;
  private String sweet;
  public Festival() {
	super();
	// TODO Auto-generated constructor stub
  }
  public Festival(Integer id, String name, String description, String month, String sweet) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
	this.month = month;
	this.sweet = sweet;
  }
  public Integer getId() {
	return id;
  }
  public void setId(Integer id) {
	this.id = id;
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public String getDescription() {
	return description;
  }
  public void setDescription(String description) {
	this.description = description;
  }
  public String getMonth() {
	return month;
  }
  public void setMonth(String month) {
	this.month = month;
  }
  public String getSweet() {
	return sweet;
  }
  public void setSweet(String sweet) {
	this.sweet = sweet;
  }
  @Override
  public String toString() {
	return "Festival [id=" + id + ", name=" + name + ", description=" + description + ", month=" + month + ", sweet="
			+ sweet + "]";
  }
  
  
}
