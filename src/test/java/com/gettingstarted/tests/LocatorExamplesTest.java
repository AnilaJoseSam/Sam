package com.gettingstarted.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class LocatorExamplesTest {

	@Managed
	WebDriver driver;

	LocatorExamplesPage page;
	
	@Title("This is my first serenity grab titles test  method!!!!!")
	@Test
	public void tc1() throws InterruptedException{
     
		//page.sel_clickOnLink();
		
		//page.sel_grabAllLinks();
		
		//page.ser_clickOnLink();
		
		page.ser_grabAllLinks();
	}
}
