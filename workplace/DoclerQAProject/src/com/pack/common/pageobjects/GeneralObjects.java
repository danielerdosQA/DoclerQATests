package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneralObjects {
	
	private static WebElement element;
	
	 public static WebElement companyLogo(WebDriver driver){		 
		    element = driver.findElement(By.id("dh_logo"));		 
		    return element;		 
	 }
	 
	 public static void navigateToSite(WebDriver driver, String website){
		 if (website.contains(driver.getCurrentUrl())){ 
			 System.out.println("User is already on the given website");			 
		 } else {
			 driver.get(website);
		 }
	 }
	
	 
	 public static String browserTitle(WebDriver driver){		 
		    String browserTitle = driver.getTitle();		 
		    return browserTitle;		 
	 }
	 
	 public static String currentURL(WebDriver driver){		 
		    String URL = driver.getCurrentUrl();		 
		    return URL;		 
	 }
	 
	 public static String currentActiveBtnId(WebDriver driver){		 
		    WebElement activeLi = driver.findElement(By.xpath("//li[@class='active']"));		 
		    String activeBtnId = activeLi.findElement(By.tagName("a")).getAttribute("id");
		    return activeBtnId;
	 }
	 
	 public static boolean verifyBrowserTitle(WebDriver driver) {
		 	String expectedBrowserTitle = "UI Testing Site";
			return expectedBrowserTitle.contains(browserTitle(driver));
	 }
	 
	 public static void browserBack(WebDriver driver) {
		 driver.navigate().back();
	 }
	 
	
}
