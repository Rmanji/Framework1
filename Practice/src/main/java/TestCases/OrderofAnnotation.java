package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderofAnnotation {
	
	

	@BeforeGroups
	public void TestGroup() {
		
		System.out.println("Before group method");
	}
	
	@BeforeClass
	public void Testclass() {
		
		System.out.println("Before class method");
	}
	
	@BeforeSuite
	public void TestSuit() {
		
		System.out.println("Before suit method");
	}
	
	@BeforeMethod
	public void Testmethod() {
		
		System.out.println("Before method method");
	}
	
	
	@BeforeTest
	public void Testbefor() {
		
		System.out.println("Before Test method");
	}
	
	@Test
	
	public void Testclass1() {
		
		System.out.println("Test 1 execute class method");
	}
	
	@Test
	
	public void Testclass2() {
		
		System.out.println("Test 2 execute class method");
	}
	
	
	@AfterSuite
	
	public void Aftersuit() {
		
		System.out.println("After suite execute class method");
	}
	
@AfterGroups
	
	public void Aftergroup() {
		
		System.out.println("After group execute class method");
	}
	
@AfterClass
public void Afterclass() {
	
	System.out.println("After class execute class method");
}
	
@AfterMethod

public void AfterMethod() {
	
	System.out.println("After method execute class method");
}

@AfterTest

public void Aftertest() {
	
	System.out.println("After test execute class method");
}
	
	
	
}
