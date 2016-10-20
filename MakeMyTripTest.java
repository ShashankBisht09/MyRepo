package com.project.selenium;

	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;

	public class MakeMyTripTest {
			@Test
			public void testMacys() throws InterruptedException{
				WebDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("http://www.makemytrip.com/");
				driver.findElement(By.xpath("//span[@class='arrow_downall']")).click();
				driver.findElement(By.xpath("//span[text()='Domestic Holidays']")).click();
				String pw=driver.getWindowHandle();
				Set<String> allWindow=driver.getWindowHandles();
				for(String s:allWindow){
					if(!pw.equals(s)){
						driver.switchTo().window(s);
						break;
					}
						
				}
			driver.findElement(By.xpath("(//input[@class='typeahead-dep-city input-md form-control field-transparent tt-input'])")).sendKeys("Jaipur");
			driver.findElement(By.xpath("//a[@id='submit-btn-holiday']")).click();
				driver.findElement(By.xpath("//span[text()=148]/following::a[1]")).click();
				
				driver.findElement(By.xpath("//div[@class='viewDetails']/descendant::a[@class='flR button view_detls pkgViewDetailLink']")).click();
			
				String sw=driver.getWindowHandle();
				
				Set<String> allWindow1=driver.getWindowHandles();
				for(String s:allWindow1){
					
					if(!sw.equals(s) && !pw.equals(s)){
						driver.switchTo().window(s);
						break;
					}
						
				}
				driver.findElement(By.xpath("//a[@class='button fullWidth alC rateDate_overlayOpen']")).click();
				driver.findElement(By.xpath("//a[@class='close_button rateDate_overlay']")).click();
				driver.close();
				driver.switchTo().window(sw);
				driver.close();
				driver.switchTo().window(pw);
				System.out.println(driver.getTitle());
			}}
	



