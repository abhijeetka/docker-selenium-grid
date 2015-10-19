package com.test;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TitleCheck_FireFox 
{	
	static String baseUrl;
	WebDriver driver;
	static String hubUrl;
	
	@Before
	public void first() throws MalformedURLException
	{
		baseUrl="http://172.27.59.35";
		hubUrl="http://172.17.0.184:4444/wd/hub";
		driver=new RemoteWebDriver(new URL(hubUrl),DesiredCapabilities.firefox());
	}
	
	@Test
	public void titleCheck()
	{
		driver.get(baseUrl);
		System.out.println(driver.getTitle());
		Assert.assertEquals("A ALM Project Management Tool", driver.getTitle());
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
