package br.ufpb.infrapacs.integrationAPI.tests;

import org.junit.After;
import org.junit.Before;

import junit.framework.TestCase;

public class GenericTestCase extends TestCase {
	
	@Before
	protected void setUp() {
		System.out.println("Start");
	}
	
	@After
	protected void tearDown() {
		System.out.println("End");
		System.gc();
	}		

}
