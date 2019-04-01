package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.CourseCode;

public class Student {
	private String firstName;
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	private String country;
	@NotNull(message="is required")
	@Min(value=0, message="It must be greater or equals than 0")
	@Max(value=10, message="It must be less or equals than 10")
	private Integer freePasses; // handle spces
	private String favoriteLanguage;
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message = "only 5 characters/digits")
	private String postalCode;
	private String[] operatingSystems;
	@CourseCode(value= {"LUV","ASD"}, message="It must start with LUV or ASD")
	private String courseCode;
	private LinkedHashMap<String,String> countryOptions;
	public Student() {
		//Populate linkedHashMaps
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR","Brasil");
		countryOptions.put("FR","France");
		countryOptions.put("DE","Germany");
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
}
