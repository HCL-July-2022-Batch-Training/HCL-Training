package com.daily;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unite test for simple App.
 */
 public class AppTest
 	extends TestCase
 {
	 /**
	  * Create the test case
	  * 
	  * @param testName name of the test case
	  */
	 public AppTest( String testName )
	 {
		 super ( testName );
	 }
	 
	 /**
	  * @return the suite of test being tested
	  */
	 public static Test suite()
	 {
		 return new TestSuite( AppTest.class );
	 }
	 
	 /**
	  * Rigorous Test :-)
	  */
	 public void testApp()
	 {
		 assertTrue( true );
	 }
 }