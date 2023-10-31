package com.uucms.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {
	public static Properties prop;
	public static WebDriver driver;
	public BaseTest()
	{
		prop=new Properties();
		FileInputStream fil = null;
		try {
			fil = new FileInputStream("C:\\Users\\csgvs\\eclipse-workspace\\Admission_module\\src\\main\\"
					+ "java\\com\\uucms\\qa\\configuration\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fil);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void initilize()
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase(browserName))
		{
			driver=new ChromeDriver();
	}
		else
		{
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
}
}
