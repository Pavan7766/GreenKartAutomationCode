package com.uucms.qa.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.uucms.qa.Base.BaseTest;
import com.uucms.qa.pages.CollegePage;
import com.uucms.qa.pages.LoginPage;

public class TestCollegePage extends BaseTest {
LoginPage lp;
 CollegePage hp;

	@BeforeMethod
	public void setup() throws IOException
	{
		initilize();
		lp=new LoginPage();
		hp=lp.collegelogin(prop.getProperty("clgun"), prop.getProperty("password"));
	}
	
	@Test
	public void verifyCollege() throws IOException
	{
		
		Assert.assertTrue(hp.verifyCollegeName(),"Correct");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
