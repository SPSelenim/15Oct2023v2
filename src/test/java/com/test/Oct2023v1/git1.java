package com.test.Oct2023v1;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sun.net.httpserver.Authenticator.Retry;

public class git1 extends Inputdata1 {
private static final String JavascriptExecutor = null;
public	SoftAssert sa=null;
public Logger log=null;
	@Test //(retryAnalyzer = Retry.class)
	public void f() {
		System.out.println("TestNG");
	//lod Data
		loadData();
		PropertyConfigurator.configure("D:\\Satish\\03Eclipse_Workspace\\15Oct2023v1\\Oct2023v1\\src\\test\\java\\com\\test\\Oct2023v1\\log4j.properties");
		log = Logger.getLogger("mydev");

		try {
			driver.get(myApplication);
			maximize();
		try {
			 log.debug("opening webiste");
		log.info("Opened");
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
			ClickGit();
			log.info("Clicked");
			
			driver.get(myApplication);
			System.out.println("=============DONNNNNNNNNNE");
			try {
			WebElement git1=driver.findElement(By.xpath("//a[@name='Mylink2']"));
			org.openqa.selenium.JavascriptExecutor jsc = (JavascriptExecutor)driver;
			jsc.executeScript("arguments[0].click();", git1);
			Thread.sleep(2000);
			System.out.println("DONNNNNNNNNNE1=========");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			takescreen(this.getClass().getName());
			sa = new SoftAssert();
				String strActualTitle = driver.getTitle();
			String strExpectedTitle = "Git";
			sa.assertEquals(strActualTitle, strExpectedTitle);
			System.out.println("Actual : " + strActualTitle);
			System.out.println("Expected : " + strExpectedTitle);
			Thread.sleep(2000);
			Assert.assertEquals(false, true);
			
		log.info("DONEEEEEEE");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
	//sa.assertAll();
		}

	}

	@AfterClass
	public void close() {
		driver.close();
	}

}
