


	package com.project.selenium;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

	public class MacysTest {
		@Test
		public void testGoogle(){
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			driver.get("http://www.macys.com/");
			driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("Jeans");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			String s1=driver.getTitle();
			System.out.println(s1);
			String s2=driver.getCurrentUrl();
			System.out.println(s2);
			driver.findElement(By.xpath("(//div [@id='fullColorOverlay_2351352_0_cat']/a[1])")).click();
			driver.findElement(By.xpath("(//li[@title='2'])")).click();
			driver.findElement(By.xpath("(//button[@id='addToBagButton2351352'])")).click();
			driver.findElement(By.xpath("(//img [@id='btnCheckout'])")).click();
			driver.findElement(By.xpath("(//div[@class='secondary linkOverride removeLink'])")).click();
			String s3=driver.findElement(By.xpath("(//div[@class='wishlistMsg wishlistsuccessmsg'])")).getText();
			System.out.println(s3);
			driver.close();
		}
	}


