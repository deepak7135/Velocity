package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotation2 {
	
	@BeforeTest 
	public void test() {
		System.out.println("before test Anotation2");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class Anotation2");
	}
	@BeforeMethod 
	public void beforemethod() {
		System.out.println("before Method Anotation2");
	}
	@Test  
	public void TestA() {
		System.out.println("Test A Anotation2");
	}
	@Test 
	public void TestB() {
		System.out.println("Test B Anotation2");
	}
	@AfterMethod 
	public void Aftermethod() {
		System.out.println("after Method Anotation2");			
	}
	@AfterClass 
	public void Afterclass() {
		System.out.println("after Class Anotation2");
			
	}
	@AfterTest
	public void test1() {
		System.out.println("after test Anotation2");
	
}}
