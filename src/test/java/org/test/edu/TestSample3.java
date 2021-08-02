package org.test.edu;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSample3 {

	@BeforeClass
	private void befoer() {
System.out.println("before me da ");
	}
	@Test
	
	private void ts3() {
		System.out.println("ts3 ");

	}
	@Test
	private void ts31() {
		System.out.println("ts31 ");

	}
	@Test
	private void ts32() {
		System.out.println("ts32 ");

	}
	@AfterClass
	private void after() {
		System.out.println("after method");

	}
	
	
	
	
}
