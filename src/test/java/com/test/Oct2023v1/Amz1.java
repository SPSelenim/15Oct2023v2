package com.test.Oct2023v1;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Amz1 extends Inputdata1 {

	@Test
	public void f() {
		System.out.println("TestNG - My Test");
		loadData();
//Added Commit
		try {
			driver.get(myApplication);
maximize();
			ClickAmaz();
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

}
