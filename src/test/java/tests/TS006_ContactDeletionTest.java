package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.ContactDeletionPage;
import pages.ContactEditingPage;
import pages.LoginPage;

public class TS006_ContactDeletionTest extends ProjectSpecificMethod{

	public TS006_ContactDeletionTest() throws IOException {
		super();
		
	}
	LoginPage loginpg;
	ContactDeletionPage contactdeletepg;
	String email=configProperties.getProperty("email");
	String password=configProperties.getProperty("password");
	String deletecontact=configProperties.getProperty("deletecontact");
	@Test
	public void deleteContact() throws InterruptedException, IOException {
		loginpg=new LoginPage(driver);
		Thread.sleep(2000);
		loginpg.enterEmail(email);
		Thread.sleep(500);
		loginpg.enterPassword(password);
		Thread.sleep(500);
		loginpg.submitbtn();
		Thread.sleep(500);
		contactdeletepg=new ContactDeletionPage(driver);
		Thread.sleep(500);
		contactdeletepg.clickforedit(deletecontact);
		Thread.sleep(500);
		contactdeletepg.clickondelete();
		Thread.sleep(500);
		contactdeletepg.seeAllDetails();
	}
}
