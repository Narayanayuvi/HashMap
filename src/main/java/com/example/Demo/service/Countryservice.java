package com.example.Demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.Demo.beans.Country;
import com.example.Demo.controller.AddResponse;


@Component
public class Countryservice
{

	static HashMap<Integer,Country> countryIdMap;
	
	public Countryservice()
	{
		countryIdMap=new HashMap<Integer,Country>();
		
		Country indiacountry=new Country(1,"India","delhi");
		Country usacountry=new Country(2,"USA","Washington");
		Country londoncountry=new Country(3,"UK","London");
		
		countryIdMap.put(1, indiacountry);
		countryIdMap.put(2, usacountry);
		countryIdMap.put(3, londoncountry);
	}
	
	public List getAllCountries()
	{
		 List countries=new ArrayList(countryIdMap.values());
		 return countries;
	}
	
	public Country getCountrybyId(int id)
	{
		Country country=countryIdMap.get(id);
		return country;
	}
	
	public Country getCountrybyName(String countryName)
	{
		Country country=null;
		for(int i:countryIdMap.keySet())
		{
			if(countryIdMap.get(i).getCountryname().equals(countryName))
				country=countryIdMap.get(i);
		}
		return country;
	}
	
	public Country addCountry(Country country)
	{
		country.setId(getMaxId());
		countryIdMap.put(country.getId(), country);
		return country;
	}
	public static int getMaxId()
	{
		int max=0;
		for(int id:countryIdMap.keySet())
			if(max<=id)
				max=id;
		return max+1;
	}
	
	public Country updateCountry(Country country)
	{
		if(country.getId()>0)
			countryIdMap.put(country.getId(),country);
		return country;
	}
	
	public AddResponse deleteCountry(int id)
	{
		countryIdMap.remove(id);
		AddResponse rs=new AddResponse();
		rs.setMsg("Country deleted");
		rs.setId(id);
		return rs;
	}
}
