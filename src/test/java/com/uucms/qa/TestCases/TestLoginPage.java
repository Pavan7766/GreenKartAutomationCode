package com.uucms.qa.TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.uucms.qa.Base.BaseTest;
import com.uucms.qa.pages.CollegePage;
import com.uucms.qa.pages.LoginPage;

public class TestLoginPage extends BaseTest{
  LoginPage lp;
  CollegePage hp;
	public TestLoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setup() throws IOException
	{
		initilize();
		lp=new LoginPage();
		
	}

	@Test
	public void  CollegeLogin() throws IOException
	{
		hp=lp.collegelogin(prop.getProperty("clgun"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
