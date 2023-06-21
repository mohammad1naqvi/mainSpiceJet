package com.spicejet.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver","C:\\Users\\naqvi\\eclipse-workspace\\spicejet.project\\Drivers\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.quit();
	}

}
