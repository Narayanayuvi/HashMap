package com.example.Demo.beans;

public class Country 
{
int id;
String countryname;
String countrycapital;

public Country(int id, String countryname, String countrycapital) {
	super();
	this.id = id;
	this.countryname = countryname;
	this.countrycapital = countrycapital;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCountryname() {
	return countryname;
}
public void setCountryname(String countryname) {
	this.countryname = countryname;
}
public String getCountrycapital() {
	return countrycapital;
}
public void setCountrycapital(String countrycapital) {
	this.countrycapital = countrycapital;
}


}

