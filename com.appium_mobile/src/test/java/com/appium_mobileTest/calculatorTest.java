package com.appium_mobileTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class calculatorTest {

	static AppiumDriver<MobileElement>driver;
	
	
	public static void main(String[] args) {
		
		try {
			opencalculator();
		} catch (IOException e) {
			
			System.out.println(e.getCause());
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}

	public static void opencalculator() throws IOException{
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "moto g(7) play");
		cap.setCapability("udid", "ZY323RM25C");
		cap.setCapability("platformName", "Andriod");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("appPackage", "com.google.andriod.calculator");
		//cap.setCapability("appActivity", "");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("Application Started............");
		
	}
	
	
}
