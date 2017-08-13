package com.brianthomas.jets;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JetsAppTests {
	Pilot pilot;
	Jet jet;
	
	@Before
	public void setUp() throws Exception {
		pilot = new Pilot("TestPilot", 33, 12);
		jet = new Jet("Test Jet", 555, 2500, 250_999, pilot);
	}

	@After
	public void tearDown() throws Exception {
		pilot = null;
		jet = null;
	}

	@Test
	public void test() {
		assertEquals(pilot.getName(), "TestPilot");
	}

}
