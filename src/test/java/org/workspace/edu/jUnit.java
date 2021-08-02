package org.workspace.edu;

import org.baseclass.edu.BaseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class jUnit extends BaseClass {

	@BeforeClass
	public static void start() {
		System.out.println("Start now");
	}

	@Before

	public void before() {
		System.out.println("before");
	}

	@Test

	public void t1() {
		System.out.println("exe 1");
	}

	@Ignore
	public void t2() {
		System.out.println("exe 2");
	}

	@Test

	public void t3() {
		System.out.println("exe 3");
	}

	@After

	public void after1() {
		System.out.println("mudinchi");
	}

}
