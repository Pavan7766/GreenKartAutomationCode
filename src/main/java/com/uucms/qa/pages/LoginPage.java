package com.uucms.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uucms.qa.Base.BaseTest;

public class LoginPage extends BaseTest {

	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//div/ul/li/a[text()='Student']")
WebElement studentLink;

@FindBy(xpath="//div/ul/li/a[text()='College/PG Center']")
WebElement collegelink;

@FindBy(xpath="//div/ul/li/a[text()='University']")
WebElement universitylink;

@FindBy(xpath="//div/ul/li/a[text()='State Admin']")
WebElement stateadminlink;

@FindBy(id="txtUserName")
WebElement userName;

@FindBy(id="txtPassword")
WebElement password;

@FindBy(id="Submit")
WebElement loginbtn;

public CollegePage collegelogin(String un, String pswd) throws IOException
{
	collegelink.click();
	userName.sendKeys(un);
	password.sendKeys(pswd);
	loginbtn.click();
	return new CollegePage();
}


}
