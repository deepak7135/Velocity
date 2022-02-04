package Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.LoginPage;

public class TestAnotation1 {
	
	@BeforeTest
	public void test() {
		System.out.println("before test TestAnotation1");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before Class Testanotation1");
	}
	@BeforeMethod 
	public void beforemethod() {
		System.out.println("before Method Testanotation1");
	}
	@Test  
	public void TestC() {
		System.out.println("Test A Testanotation1");
	}
	@Test 
	public void TestD() {
		System.out.println("Test B Testanotation1");
	}
	@AfterMethod 
	public void Aftermethod() {
		System.out.println("after Method Testanotation1");			
	}
	@AfterClass 
	public void Afterclass() {
		System.out.println("after Class Testanotation1");
	}
	@AfterTest
	public void test1() {
		System.out.println("after test TestAnotation1");
		}
	

}
