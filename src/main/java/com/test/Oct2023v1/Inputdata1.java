package com.test.Oct2023v1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Inputdata1 {
	public File F = null;
	public Properties pp = null;
	public FileInputStream fis = null;
	public WebDriver driver = null;
	public String myApplication = "file:///D:/Satish/05DemoApps/demo.html";
	public File destiantion,source=null;

	public void loadData() {

		try {
			F = new File(
					"D:\\Satish\\03Eclipse_Workspace\\15Oct2023v1\\Oct2023v1\\src\\main\\java\\com\\test\\Oct2023v1\\myData.properties");
			fis = new FileInputStream(F);
			pp = new Properties();
			pp.load(fis);

			System.setProperty("webdriver.gecko.driver", "D:\\Satish\\05DemoApps\\ChromeDriver\\geckodriver.exe");
			driver = new FirefoxDriver();

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

	public void takescreen(String fname) throws IOException
	{
		TakesScreenshot tt=((TakesScreenshot)driver);
		source=tt.getScreenshotAs(OutputType.FILE);
		String path1="D://Satish//03Eclipse_Workspace//15Oct2023v1//Oct2023v1//screenshot//"+fname+".bmp";

		destiantion=new File(path1);
FileUtils.copyFile(source, destiantion);

	}
	
	
	
	public void ClickGit() {
		try {
			driver.findElement(By.xpath(pp.getProperty("git1"))).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
