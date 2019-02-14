package com.cg.test;
import java.util.Date;
import org.junit.Test;
import junit.framework.Assert;
public class TestDate {
	@Test
	public void testGetDay() {
		Date date = new Date(16, 8, 2018);
		Assert.assertEquals(16, date.getDay());
	}
	@Test
	public void testGetMonth() {
		Date date = new Date(16, 8, 2018);
		Assert.assertEquals(8, date.getMonth());
	}
	@Test
	public void testGetYear() {
		Date date = new Date(16, 8, 2018);
		Assert.assertEquals(2018, date.getYear());
	}
}