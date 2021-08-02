package org.test.edu;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSample2 {

	@BeforeMethod
	private void befor() {
		System.out.println("before method");

	}
	@Test
	private void ts2() {
		System.out.println("ts1");

	}
	@Test
	private void ts22() {
		System.out.println("ts2");

	}
	@Test
	private void ts23() {
		System.out.println("ts3");

	}
	
	
	
}
