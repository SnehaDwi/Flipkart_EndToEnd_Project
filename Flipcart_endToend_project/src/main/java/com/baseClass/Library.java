package com.baseClass;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {

    public static Properties prop;
    public static WebDriver driver;

    public void launchApplication() {

        try {
            FileInputStream input = new FileInputStream("./src/test/resources/Properties/config.properties" );

            prop = new Properties();
            prop.load(input);

            if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } 
            else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(prop.getProperty("url"));

        } catch (Exception e) {
        	System.out.println("browser didn't launch" );
            e.printStackTrace();
        }
    }
}