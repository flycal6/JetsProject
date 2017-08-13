package com.brianthomas.jets;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JetsAppTests {
	JetsApp app;
	Pilot pilot;
	Pilot jimbo;
	Pilot jim;
	Pilot jimmy;
	Pilot jimmers;
	Pilot jiminy;

	Jet jet;
	Jet cesna;
	Jet c5;
	Jet a380;
	Jet citX;
	Jet cub;

	Jet[] fleet;

	@Before
	public void setUp() throws Exception {
		app = new JetsApp();

		pilot = new Pilot("TestPilot", 33, 12);
		jet = new Jet("Test Jet", 555, 2500, 250_999, pilot);

		jimbo = new Pilot("Jimbo", 33, 3);
		jim = new Pilot("Jim", 38, 20);
		jimmy = new Pilot("Jimmy", 23, 18);
		jimmers = new Pilot("Jimmers", 44, 33);
		jiminy = new Pilot("Jiminy", 77, 12);

		cesna = new Jet("Cesna 172", 188, 736.3, 274_900, jim);
		c5 = new Jet("C-5 Galaxy", 540, 16_320, 100_370_000, jimmy);
		a380 = new Jet("Airbus A380", 683, 8000, 375_300_300, jiminy);
		citX = new Jet("Cesna Citation X", 604, 3700, 23_365_000, jimmers);
		cub = new Jet("Piper Cub J-3", 87, 220, 75_000, jimbo);

		fleet = new Jet[10];
		fleet[0] = cesna;
		fleet[1] = citX;
		fleet[2] = cub;
		fleet[3] = a380;
		fleet[4] = c5;
		fleet[5] = jet;
	}

	@After
	public void tearDown() throws Exception {
		pilot = null;
		jet = null;

		jimbo = null;
		jim = null;
		jimmy = null;
		jimmers = null;
		jiminy = null;

		cesna = null;
		c5 = null;
		a380 = null;
		citX = null;
		cub = null;

	}

	@Test
	public void viewLongestRangeJet_returns_correct() {
		assertEquals(app.viewLongestRangeJet(fleet), c5);
	}

	@Test
	public void listFleet_test() {
		assertEquals(app.viewFastestJet(fleet), a380);
	}

}
