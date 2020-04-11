package com.gettingstarted.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class LocatorExamplesTest {

	@Managed
	WebDriver driver;

	LocatorExamplesPage page;
	
	@Test
	public void tc1() throws InterruptedException{
     
		//page.sel_clickOnLink();
		
		//page.sel_grabAllLinks();
		
		//page.ser_clickOnLink();
		
		page.ser_grabAllLinks();
	}
}
