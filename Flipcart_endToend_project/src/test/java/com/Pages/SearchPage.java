package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ReusableFunction.SeleniumReusable;
import com.baseClass.Library;

public class SearchPage extends Library{

    WebDriver driver;
    SeleniumReusable se;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='q']")
    WebElement searchText;
    
  @FindBy(xpath = "//html[@lang='en-IN']")
  WebElement HomePage;
  
  @FindBy(xpath = "//html [@class='en-fonts-loaded useInterFont']")
  WebElement SearchResult;
    public void search(String text) {
        se = new SeleniumReusable(driver);
        se.EnterValue(searchText, text);
    }

    public void clickSearch(String text) {
        searchText.sendKeys(text);
    }
    
    public void homeScreen() {
    	HomePage.isDisplayed();
    	
    }
    public void Result() {
    	System.out.println(SearchResult.isDisplayed());
    	System.out.println(driver.getTitle());
    }
}
