package org.baseclass.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	WebDriver driver;

	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\org.euro.eu\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	public void findele() {
driver.findElement(By.xpath("string"));
	}
	
	public void getData() {

	}

	public void LaunchUrl(String url) {
		driver.get(url);
	}

	public void enterText(WebElement ref, String name) {
		ref.sendKeys(name);
	}

	public void getCurrentUrl(String url) {
		driver.getCurrentUrl();
	}

	public void toGetTitle() {
		driver.getTitle();
	}

	public void textGet(WebElement ref) {
		ref.getText();
	}

	public void attributeGet(WebElement ref, String Value) {
		ref.getAttribute(Value);
	}

	public void pageSource() {
		driver.getPageSource();
	}

	public void oneWindowId() {
		driver.getWindowHandle();
	}

	public void multipleWinID(int i) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li = new ArrayList<String>(windowHandles);

		driver.switchTo().window(li.get(i));
	}

	public void navigate() {
		driver.navigate();
	}

	public void closebrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void notifyonc() {
		driver.notify();
	}

	public void notiAll() {
		driver.notifyAll();
	}

	public void deleteCookies() {
		driver.manage().deleteAllCookies();
	}

	public void setWinSize() {
		int Integer = 250;
		Point d = new Point(Integer, Integer);
		driver.manage().window().setPosition(d);
	}

	public void setSize() {
		int Integer = 500;
		Dimension d1 = new Dimension(Integer, Integer);
		driver.manage().window().setSize(d1);
	}

	public void fFive() {
		driver.navigate().refresh();
	}

	public void forward() {
		driver.navigate().forward();
	}

	public void back() {
		driver.navigate().back();
	}

	public void ClearTextBox(WebElement ref) {
		ref.clear();
	}

	public void toDisplay(WebElement ref) {
		ref.isDisplayed();
	}

	public void checkEnabled(WebElement ref) {
		ref.isEnabled();
	}

	public void checkSelected(WebElement ref) {
		ref.isSelected();
	}

	


}
