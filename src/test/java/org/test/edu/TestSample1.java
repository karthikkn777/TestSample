package org.test.edu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSample1 {

	WebDriver driver;
	@BeforeClass
	private void before() {
		System.out.println("before class");
	}

	@Test(dataProvider = "Test Data")
	private void tc1(String s, String s1) {
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\org.adac.com\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='username']"));
		txtUserName.sendKeys(s);

		WebElement txtPass = driver.findElement(By.xpath("//input[@id='password']"));
		txtPass.sendKeys(s1);
		WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login']"));
		loginBtn.click();

	}

	@DataProvider(name="Test Data")
	public Object[][]getData() {
		return new Object[][] {
			{"Karthik","112111234"},
			{"Aakakja","12133313"}
			,{"alaan","1313133"},
			{"lol","12211"},
			{"Palaal","12131313"}
			
		};
	

	}
	
	@Test
	private void tc2() {
		System.out.println("test2");

	}

	@Test
	private void tc3() {
		System.out.println("test3");

	}

	@AfterClass
	private void after() {
		System.out.println("after method ");

	}

}
