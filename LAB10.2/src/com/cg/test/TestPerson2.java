package com.cg.test;
import org.junit.Assert;
import org.junit.Test;
import com.cg.beans.Person2;
public class TestPerson2 {
	@Test
	public void getFirstNameForInvalidName() {
		Person2 expectedValue = new Person2("souree", "biswas",'F');
		expectedValue.getFirstName();
	}
	@Test
	public void getFirstNameForValidName() {
		Person2 expectedValue = new Person2("souree", "biswas",'F');
		Assert.assertEquals("souree",expectedValue.getFirstName());
	}
	@Test
	public void getLastNameForInvalidName() {
		Person2 expectedValue = new Person2("souree", "biswas",'F');
		expectedValue.getLastName();
	}
	@Test
	public void getLastNameForValidName() {
		Person2 expectedValue = new Person2("souree", "biswas",'F');
		Assert.assertEquals("biswas",expectedValue.getLastName());
	}
	@Test
	public void getGenderForInvalidGender() {
		Person2 expectedValue = new Person2("souree", "biswas",'F');
		expectedValue.getGender();
	}
	@Test
	public void getGenderForValidGender() {
		Person2 expectedValue = new Person2("souree", "biswas",'F');
		Assert.assertEquals('F',expectedValue.getGender());
	}
}