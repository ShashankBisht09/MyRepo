package com.project.selenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClassTest {
	@Test
	public void testAssert() throws InterruptedException{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.xpath("//a[text()='Flight Tickets']")).click();
		String pw=driver.getWindowHandle();
	    Set<String> allWindow=driver.getWindowHandles();
	    for(String s:allWindow){
			if(!pw.equals(s)){
				driver.switchTo().window(s);
				break;
			}
	}
	    String s=driver.getCurrentUrl();
	    Assert.assertTrue(s.contains("air"));
	    WebElement we=driver.findElement(By.xpath("//input[@checked='checked']"));
       Assert.assertTrue(we.isSelected());
       we=driver.findElement(By.xpath("//div[@class='roundtripradio']/input[@name='tripType']"));
       Assert.assertFalse(we.isSelected());
       driver.findElement(By.xpath("//input[@id='origin']")).sendKeys("Delhi");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='origin']")).sendKeys(Keys.TAB); 
	    driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Shil");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='destination']")).sendKeys(Keys.TAB);
	    driver.findElement(By.xpath("//div[@id='where']/div[4]/img")).click();
	    driver.findElement(By.xpath("//td[@data-month='10']/a[text()='30']")).click();
	    Select sel=new Select(driver.findElement(By.id("noOfAdult")));
	    sel.selectByValue("2");
	    Select sel1=new Select(driver.findElement(By.id("noOfChild")));
	    sel1.selectByValue("1");
	    driver.findElement(By.xpath("//div[@onclick='submitSearch();']")).click();
	    List<WebElement> list=driver.findElements(By.xpath("//div[@class='onewayflightinfo']"));
	    int count=list.size();
	    Assert.assertTrue(count>0&&count<100);
	    System.out.print(count);
	    driver.close();
    	
}}
