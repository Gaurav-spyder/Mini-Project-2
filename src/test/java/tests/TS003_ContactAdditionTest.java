package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.ContactAdditionPage;
import pages.LoginPage;

public class TS003_ContactAdditionTest extends ProjectSpecificMethod{

	public TS003_ContactAdditionTest() throws IOException {
		super();
	}
	
	LoginPage loginpg;
	ContactAdditionPage contactpg;
	String email=configProperties.getProperty("email");
	String password=configProperties.getProperty("password");
	String firstname=configProperties.getProperty("firstname");
	String lastname=configProperties.getProperty("lastname");
	String dOB=configProperties.getProperty("dOB");
	String Email=configProperties.getProperty("Email");
	String phone=configProperties.getProperty("phone");
	String street1=configProperties.getProperty("street1");
	String street2=configProperties.getProperty("street2");
	String city=configProperties.getProperty("city");
	String state=configProperties.getProperty("state");
	String pincode=configProperties.getProperty("pincode");
	String country=configProperties.getProperty("country");
	
	@Test
	public void addContact() throws IOException, InterruptedException {
		loginpg=new LoginPage(driver);
		Thread.sleep(2000);
		loginpg.enterEmail(email);
		Thread.sleep(500);
		loginpg.enterPassword(password);
		Thread.sleep(500);
		loginpg.submitbtn();
		Thread.sleep(500);
		contactpg=new ContactAdditionPage(driver);
		Thread.sleep(500);
		contactpg.addnewContact();
		Thread.sleep(500);
		contactpg.addContactDetails(lastname, firstname, dOB, email, phone, dOB, Email, city, state, pincode, country);
		Thread.sleep(500);	
		contactpg.clickOnsubmit();
		Thread.sleep(500);	
		contactpg.seeDOBmsg();
	}
}
