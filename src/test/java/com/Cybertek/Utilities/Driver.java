package com.Cybertek.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver.quit();
            driver = null;
        }

            String browser = ConfigurationReader.getProperty("configuration.properties");

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();




            driver.manage().window().maximize();
//       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return driver;


        }
        }

