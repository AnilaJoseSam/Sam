package com.gettingstarted.tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import net.thucydides.core.annotations.Title;

public class MessengerTest {
	
	
	static AppiumDriver<MobileElement> driver;
	

	public static void main(String[] args) {
		try {
			openMessenger();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		// TODO Auto-generated method stub

	}
	@Title("This is my first serenity mobile test  method!!!!!")
	@Test
	public  static void openMessenger() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Galaxy M30s");
		cap.setCapability("udid", "RZ8M9127KDV");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		URL url = new URL("http://192.168.1.104:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		System.out.println("Application started.....");
		
		//MobileElement one = driver.findElement();
		//one.click();
	}

}
