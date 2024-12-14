package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.ContactDeletionPage;
import pages.LoginPage;
import pages.LogoutPage;

public class TS007_LogoutTest extends ProjectSpecificMethod{

	public TS007_LogoutTest() throws IOException {
		super();
		
	}
	LoginPage loginpg;
	LogoutPage logoutpg;
	String email=configProperties.getProperty("email");
	String password=configProperties.getProperty("password");

	@Test
	public void logoutfunctionality() throws IOException, InterruptedException {
		loginpg=new LoginPage(driver);
		Thread.sleep(2000);
		loginpg.enterEmail(email);
		Thread.sleep(500);
		loginpg.enterPassword(password);
		Thread.sleep(500);
		loginpg.submitbtn();
		Thread.sleep(500);
		logoutpg=new LogoutPage(driver);
		Thread.sleep(500);
		logoutpg.clickonlogout();
		Thread.sleep(2000);
		logoutpg.seeLoginPage();
	}
}
