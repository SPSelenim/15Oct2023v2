package com.test.Oct2023v1;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputdata1 {
	public File F = null;
	public Properties pp = null;
	public FileInputStream fis = null;
	public WebDriver driver = null;
	public String myApplication = "file:///D:/Satish/05DemoApps/demo.html";

	public void loadData() {

		try {
			F = new File(
					"D:\\Satish\\03Eclipse_Workspace\\15Oct2023v1\\Oct2023v1\\src\\main\\java\\com\\test\\Oct2023v1\\myData.properties");
			fis = new FileInputStream(F);
			pp = new Properties();
			pp.load(fis);

			System.setProperty("webdriver.chrome.driver", "D:\\Satish\\05DemoApps\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void EnterFirstName(String first) {
		try {
			driver.findElement(By.id(pp.getProperty("FName"))).sendKeys(first);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void EnterLastName(String last) {
		try {
			driver.findElement(By.id(pp.getProperty("LName"))).sendKeys(last);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void maximize()
	{
		driver.manage().window().maximize();
	}

	public void ClickAmaz() {
		try {
			driver.findElement(By.xpath(pp.getProperty("amaz1"))).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void ClickGit() {
		try {
			driver.findElement(By.xpath(pp.getProperty("git1"))).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
