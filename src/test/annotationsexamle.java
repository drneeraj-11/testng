package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotationsexamle {
  @BeforeMethod
  
  public void  initialization()
  {
	  System.out.println("browser instance created");
  }
  @Test
  public void logintest()
  {
	  System.out.println("we are performing login");
  }
  @Test
  public void logotest()
  {
	  System.out.println("we are validating logo");
  }
  @AfterMethod
  public void tearDown()
  {
	  System.out.println("browser instance closed");
  }
  
}
