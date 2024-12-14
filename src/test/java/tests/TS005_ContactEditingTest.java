package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.ContactDisplayPage;
import pages.ContactEditingPage;
import pages.LoginPage;

public class TS005_ContactEditingTest extends ProjectSpecificMethod{

	public TS005_ContactEditingTest() throws IOException {
		super();
		
	}
	LoginPage loginpg;
	ContactEditingPage contacteditpage;
	String email=configProperties.getProperty("email");
	String password=configProperties.getProperty("password");
	String efirstname=configProperties.getProperty("editfirstname");
	String elastname=configProperties.getProperty("editlastname");
	String edob=configProperties.getProperty("editdOB");
	String eemail=configProperties.getProperty("editemail");
	
	@Test
	public void editContact() throws InterruptedException, IOException {
		loginpg=new LoginPage(driver);
		Thread.sleep(2000);
		loginpg.enterEmail(email);
		Thread.sleep(500);
		loginpg.enterPassword(password);
		Thread.sleep(500);
		loginpg.submitbtn();
		Thread.sleep(500);
		contacteditpage=new ContactEditingPage(driver);
		Thread.sleep(500);
		contacteditpage.clickforedit();
		Thread.sleep(500);
		contacteditpage.clickOnEditContactBtn();
		Thread.sleep(500);
		contacteditpage.addEditDetails(elastname, efirstname, eemail);
		Thread.sleep(500);
		contacteditpage.clickonsubmit();
	}
}
