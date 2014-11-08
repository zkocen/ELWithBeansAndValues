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
		
		c.setName(name);
		assertEquals("Could not set name as expected", name, c.getName());
		
		c.setContinent(continent);
		assertEquals("Could not set Continent as expected", continent, c.getContinent());
		
		c.setRegion(region);
		assertEquals("Could not set Region as expected", region, c.getRegion());
		
		c.setSurfaceArea(surfaceArea);
		assertEquals("Could not set surfaceArea as expected", surfaceArea, c.getSurfaceArea(), delta);
		
		c.setIndepYear(indepYear);
		assertEquals("Could not set indepYear as expected", indepYear, c.getIndepYear());
		
		c.setPopulation(population);
		assertEquals("Could not set population as expected", population, c.getPopulation());
		
		c.setLifeExpectancy(lifeExpectancy);
		assertEquals("Could not set lifeExpectancy as expected", lifeExpectancy, c.getLifeExpectancy(), delta);
		
		c.setGnp(gnp);
		assertEquals("Could not set GNP as expected", gnp, c.getGnp(), delta);
		
		c.setGnpOld(gnpOld);
		assertEquals("Could not set GNPOld as expected", gnpOld, c.getGnpOld(), delta);
		
		c.setLocalName(localName);
		assertEquals("Could not set localName as expected", localName, c.getLocalName());
		
		c.setGovernmentForm(governmentForm);
		assertEquals("Could not set governmentForm as expected", governmentForm, c.getGovernmentForm());
		
		c.setHeadOfState(headOfState);
		assertEquals("Could not set headOfState as expected", headOfState, c.getHeadOfState());
		
		c.setCapital(Capital);
		assertEquals("Could not set Capital as expected", Capital, c.getCapital());
		
		c.setCode2(code2);
		assertEquals("Could not set code2 as expected", code2, c.getCode2());
	}

}
