package com.test.Oct2023v1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class InvokeApps extends Inputdata1 {

	@Test
	public void f() {
		System.out.println("TestNG - MyTest");
		loadData();

		try {
			driver.get(myApplication);
maximize();
			EnterFirstName("FNAMMM");
			EnterLastName("LAAAMMM");

			Thread.sleep(2000);
			takescreen(this.getClass().getName());			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}

	@Override
	public void ClickAmaz() {
		// TODO Auto-generated method stub
		super.ClickAmaz();
	}
	
}
