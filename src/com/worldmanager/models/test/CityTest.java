package com.worldmanager.models.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.worldmanager.models.City;

public class CityTest {
	City c;
	private int id = 10;
	private String name = "Bournemouth";
	private String countryCode = "UK";
	private String district = "Dorset";
	private int population = 300000;
	
	@Before
	public void setUp() throws Exception {
		c = new City();
	}
	
	@Test
	public void testDefaultConstructor() {
		assertNotNull("Could not create a default city", c);
	}

}
