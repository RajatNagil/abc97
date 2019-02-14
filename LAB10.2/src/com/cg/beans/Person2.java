package com.cg.beans;
public class Person2 {
	private String firstname,lastname;
	private char gender;
	Person2() {
		firstname="";
		lastname="";
		gender='\0';
	}
	public Person2(String f,String l,char g) {
		firstname=f;
		lastname=l;
		gender=g;
	}
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String k) {
		firstname=k;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String k){
		lastname=k;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char k) {
		gender=k;
	}	
}