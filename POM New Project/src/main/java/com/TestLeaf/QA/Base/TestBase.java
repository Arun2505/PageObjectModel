package com.TestLeaf.QA.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Testleaf\\eclipse-workspace\\POM New Project\\"
					+ "src\\main\\java\\com\\TestLeaf\\QA\\Config\\config.properties");

			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {

		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Testleaf\\" + "eclipse-workspace\\POM New Project\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if (browserName.equals("FF")) {
			driver = new FirefoxDriver();
		}

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get(prop.getProperty("url"));

		}

	}


