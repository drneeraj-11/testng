package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

		public class Annotations {
			@BeforeSuite
			public void BS()
			{
				System.out.println("this is before suit annotation");
			}
			@BeforeTest
			public void BT()
			{
				System.out.println("this is before Test annotation");
			}
			@BeforeClass
			public void BC()
			{
				System.out.println("this is before class annotation");
			}
			@BeforeMethod
			public void BM()
			{
				System.out.println("this is before Method annotation");	
			}
			@Test
			public void loginTest()
			{
				System.out.println("login test passed");
			}
			@AfterMethod
			public void AM()
			{
				System.out.println("this is a after method annotations");
			}
			@AfterClass
			public void AC()
			{
				System.out.println("this is after class annotations");
			}
			@AfterTest
			public void AT()
			{
				System.out.println("this is a after test annotations");
			}
			@AfterSuite
			public void AS()
			{
				System.out.println("this is Aftersuite annotations");
			}
}
