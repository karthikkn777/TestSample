package org.workspace.edu;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNxtGen {

	@BeforeClass

	private void beforeclas() {
		System.out.println("let me start it ");
	}

	@BeforeMethod

	private void method() {
		System.out.println("Before method ");
	}

	@Test(priority = -20)
	private void t1() {
		System.out.println("test1  ");
	}

	@Test(priority = -50)
	private void t2() {
		System.out.println("test2 ");

	}

	@Test
	private void t3() {
		System.out.println("test3 ");

	}
@Test
	private void t4() {
		System.out.println("test4");
	}
@Test
	private void t5() {
		System.out.println("test5");
	}

	@AfterMethod
	private void sysout() {
		System.out.println("after method ");

	}

	@AfterClass
	private void afterme() {
		System.out.println("done folks");

	}

}
