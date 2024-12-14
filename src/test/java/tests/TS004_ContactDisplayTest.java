package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.ContactDisplayPage;
import pages.LoginPage;

public class TS004_ContactDisplayTest extends ProjectSpecificMethod{

	public TS004_ContactDisplayTest() throws IOException {
		super();
		
	}
	LoginPage loginpg;
	ContactDisplayPage contactdisplaypg;
	String email=configProperties.getProperty("email");
	String password=configProperties.getProperty("password");
	
	@Test
	public void seeContactDetails() throws IOException, InterruptedException {
		loginpg=new LoginPage(driver);
		Thread.sleep(2000);
		loginpg.enterEmail(email);
		Thread.sleep(500);
		loginpg.enterPassword(password);
		Thread.sleep(500);
		loginpg.submitbtn();
		Thread.sleep(500);
		contactdisplaypg=new ContactDisplayPage(driver);
		Thread.sleep(500);
		contactdisplaypg.seeAllDetails();
		Thread.sleep(500);
		contactdisplaypg.seeAlphabetical();
		Thread.sleep(500);
		contactdisplaypg.seemsg();
	}

}
