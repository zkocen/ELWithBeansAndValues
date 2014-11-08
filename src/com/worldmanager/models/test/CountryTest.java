package com.worldmanager.models.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.worldmanager.models.Country;

public class CountryTest {

	Country c;
	private String code = "SLO";
	private String name = "Slovenia";
	private String continent = "Europe";
	private String region = "Koroska";
	private double surfaceArea = 20.273;
	private int indepYear = 1991;
	private int population = 2000000;
	private double lifeExpectancy = 76;
	private double gnp = 58509000000.0;
	private double gnpOld = 43509000000.0;
	private String localName = "Slovenija";
	private String governmentForm = "Democracy";
	private String headOfState = "Miro Cerar";
	private String Capital = "Ljubljana";
	private String code2 = "1000";
	private double delta = 0.0001;
			
	@Test
	public void testDefaultConstructor() {
		c = new Country();
		assertNotNull("Could not create Country", c);
	}
	
	@Test
	public void testMutatorsAndAccessors() {
		c = new Country();
		c.setCode(code);
		assertEquals("Could not set code as expected", code, c.getCode());
	}

}
