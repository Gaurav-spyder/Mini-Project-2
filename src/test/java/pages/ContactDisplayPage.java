package pages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.ProjectSpecificMethod;

public class ContactDisplayPage extends ProjectSpecificMethod{

	public ContactDisplayPage(WebDriver driver) throws IOException {
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}
	
	@FindBy(xpath="//tr[@class='contactTableBodyRow']/td[2]")
	List<WebElement> name;
	
	@FindBy(xpath="//tr[@class='contactTableBodyRow']/td[5]")
	List<WebElement> seeContact;
	
	@FindBy(xpath="//tr[@class='contactTableBodyRow']/td/following-sibling::td")
	List<WebElement> seeAllDetails;
	
	@FindBy(xpath="(//tr[@class='contactTableBodyRow']/td[2])[1]")
	WebElement dob;
	
	public void seeAllDetails() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		List<WebElement> details=seeAllDetails;
		for(WebElement detail:details) {
			wait.until(ExpectedConditions.visibilityOf(detail));
			System.out.println(detail.getText());
			Thread.sleep(500);
		}
	}

	public void seeContact() throws InterruptedException {
		List<WebElement> contacts=seeContact;
			for(WebElement contact:contacts) {
				Thread.sleep(500);
			Assert.assertTrue(contact.getText().contains("+91"));
			Thread.sleep(500);
			}
			System.out.println("Pass");
		} 
	public void seeAlphabetical() throws InterruptedException {
		List<WebElement> names=name;
			for(WebElement name:names) {
				Thread.sleep(500);
				String name_split =name.getText();
			Thread.sleep(500);				
			char firstLetter = name_split.charAt(0);
				System.out.println(firstLetter);
			}
		} 
	
	public void seemsg() {
		System.out.println(dob.getText());
	}
}
