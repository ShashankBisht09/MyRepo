package com.project.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyClass1 {
	@BeforeSuite
	public void bs(){
		
		System.out.println("from c1 before suite");	
	}
	@AfterSuite
	public void as(){
		
		System.out.println("from c1 after suite");	
	}
	@BeforeTest
	public void bt(){
		
		System.out.println("from c1 before test");	
	}
	@AfterTest
	public void at(){
		
		System.out.println("from c1 after test");	
	}
	
	@Test
	public void m1() {
		System.out.println("from  c1 m1");
	}
	@Test
	public void m2() {
		System.out.println("from c1 m2");
	}
	@BeforeMethod
	public void bm(){
		
		System.out.println("from c1 before method");	
	}
	
	@AfterMethod
	public void am(){
		
		System.out.println("from c1 after method");	
	}
	@BeforeClass
	public void bc(){
		
		System.out.println("from c1 before class");	
	}
	@AfterClass
public void ac(){
		
		System.out.println("from c1 after class");	
	}
	
}
