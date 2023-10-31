package com.uucms.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uucms.qa.Base.BaseTest;

public class CollegePage extends BaseTest{

	public CollegePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath = "//span[text()='Shri Chatrapati Shivaji Maharaj Arts, Science& BCA']")
	//@FindBy(xpath ="//button[text()='Manuals']")
	WebElement collegeName;
	
	public boolean verifyCollegeName()
	{
		return collegeName.isDisplayed();
	}
	

}
