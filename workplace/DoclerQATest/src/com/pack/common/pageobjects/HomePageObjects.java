package com.pack.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageObjects {  
	
	private static WebElement element = null;
		
	 public static WebElement homeBtn(WebDriver driver){		 
		    element = driver.findElement(By.id("home"));		 
		    return element;		 
	 }	
	 
	 public static WebElement testingLogo(WebDriver driver){		 
		    element = driver.findElement(By.id("site"));		 
		    return element;		 
	 }
	  
	 public static String homeHeaderText(WebDriver driver){
		 	WebElement mainContainer = driver.findElement(By.className("ui-test"));
		    String homeHeader = mainContainer.findElement(By.tagName("h1")).getText();		 
		    return homeHeader;		 
	 }
	 
	 public static boolean verifyHomeHeaderText(WebDriver driver) {
		 	String expectedHomeHeaderText = "Welcome to the Docler Holding QA Department";
			return homeHeaderText(driver).contains(expectedHomeHeaderText);
	 }
	 
	 public static String homeParagraphText(WebDriver driver){		 
		 	WebElement mainContainer = driver.findElement(By.className("ui-test"));
		    String homeParagraph = mainContainer.findElement(By.tagName("p")).getText();		 
		    return homeParagraph;
	 }
	 
	 public static boolean verifyHomeParagraphText(WebDriver driver) {
		 	String expectedHomeParagraphText = "This site is dedicated to perform some exercises and demonstrate automated web testing.";
			return homeParagraphText(driver).contains(expectedHomeParagraphText);
	 }
	 
	 public static boolean verifyHomeUrl(WebDriver driver) {
			String currentURL = driver.getCurrentUrl();
			String homeURL ="http://uitest.duodecadits.com/";
			return currentURL.contains(homeURL);
	 }
	 
	 public static void waitUntilCompanyLogoAppears(WebDriver driver){
		 WebDriverWait wait = new WebDriverWait(driver, 15);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dh_logo")));		 
	 }
	 
	 public static void waitUntilHomeHeaderAppears(WebDriver driver){
		 WebDriverWait wait = new WebDriverWait(driver, 15);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Welcome to the Docler')")));		 
	 }
	 
	 public static boolean verifyHomeBtnActive(WebDriver driver) {
			return GeneralObjects.currentActiveBtnId(driver).contains("home");
	 }
	 
	 public static void navigateToHomePageWithHomeBtn(WebDriver driver){
	    	 homeBtn(driver).click();
	    	 waitUntilHomeHeaderAppears(driver);
	 }
	 
	 public static void navigateToHomePageWithTestingLogo(WebDriver driver){
		 testingLogo(driver).click();
    	 waitUntilHomeHeaderAppears(driver);
	 }
	 

}
