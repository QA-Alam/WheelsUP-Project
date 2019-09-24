package com.pageobjectmodel;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.basepage.BasePage;


public class PageObject extends BasePage {

	// Initializing the Page Objects:
	public PageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='A Revolution Has Taken Flight']")
	@CacheLookup
	private WebElement findwelcomescreen;

	public WebElement findwelcomescreen() {
		return findwelcomescreen;
	}

	public boolean verifywelcomescreenDisplay() {
		return findwelcomescreen.isDisplayed();
	}

	public WebElement verifyContactInfo() {
		WebElement Element = driver
				.findElement(By.xpath("(//*[@class='u-uhd6 u-md12 u-columns option ng-star-inserted'])[3]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		System.out.println(Element.getText());
		return Element;
	}

	@FindBy(xpath = "//*[@class='u-uhd6 u-md12 u-columns option last-option ng-star-inserted']")
	@CacheLookup
	private WebElement verifyAddress;

	public WebElement verifyAddress() {
		return verifyAddress;
	}

	@FindBy(xpath = "//*[text()=' Membership Options ']")
	@CacheLookup
	private WebElement ClickOMembershipOptions;

	public WebElement ClickOMembershipOptions() {
		return ClickOMembershipOptions;
	}

	@FindBy(xpath = "//*[text()='CORE MEMBERSHIP']")
	@CacheLookup
	private WebElement ClickONCOREMEMBERSHIP;

	public WebElement ClickONCOREMEMBERSHIP() {
		return ClickONCOREMEMBERSHIP;
	}

	public WebElement verifyBecomingMember() {
		WebElement Member = driver.findElement(By.xpath("//*[text()='Becoming a Wheels Up Core Member is easy']"));
		js.executeScript("arguments[0].scrollIntoView();", Member);
		System.out.println(Member.getText());
		return Member;
	}

	@FindBy(xpath = "(//*[@class='content'])[9]")
	@CacheLookup
	private WebElement Onetimeinitiationfee;

	public WebElement Onetimeinitiationfee() {
		return Onetimeinitiationfee;
	}

	public WebElement verifyLearnMoreToday() {
		WebElement Learn = driver.findElement(By.xpath("//*[text()='Learn more today']"));
		js.executeScript("arguments[0].scrollIntoView();", Learn);
		return Learn;
	}

	@FindBy(id = "FirstName-clone")
	@CacheLookup
	private WebElement EnetrFirstName;

	public WebElement EnetrFirstName() {
		return EnetrFirstName;
	}

	@FindBy(xpath = "//*[@id='LastName-clone']")
	@CacheLookup
	private WebElement EnetrLastName;

	public WebElement EnetrLastName() {
		return EnetrLastName;
	}

	@FindBy(xpath = "//*[text()=' CONTINUE ']")
	@CacheLookup
	private WebElement ClickONCONTINUE;

	public WebElement ClickONCONTINUE() {
		return ClickONCONTINUE;
	}

	@FindBy(id = "Email-clone")
	@CacheLookup
	private WebElement EnetrEmail;

	public WebElement EnetrEmail() {
		return EnetrEmail;
	}

	@FindBy(id = "Phone-clone")
	@CacheLookup
	private WebElement EnetrPhoneNum;

	public WebElement EnetrPhoneNum() {
		return EnetrPhoneNum;
	}

	@FindBy(id = "Company__c-clone")
	@CacheLookup
	private WebElement EnetrComoanyName;

	public WebElement EnetrComoanyName() {
		return EnetrComoanyName;
	}

	@FindBy(id = "Address-clone")
	@CacheLookup
	private WebElement EnetrAddress;

	public WebElement EnetrAddress() {
		return EnetrAddress;
	}

	@FindBy(id = "City-clone")
	@CacheLookup
	private WebElement EnetrCity;

	public WebElement EnetrCity() {
		return EnetrCity;
	}

	@FindBy(id = "PostalCode-clone")
	@CacheLookup
	private WebElement EnetrPostalCode;

	public WebElement EnetrPostalCode() {
		return EnetrPostalCode;
	}

	@FindBy(id = "State-clone")
	@CacheLookup
	private WebElement EnetrState;

	public WebElement EnetrState() {
		return EnetrState;
	}

	@FindBy(id = "Country-clone")
	@CacheLookup
	private WebElement EnetrCountry;

	public WebElement EnetrCountry() {
		return EnetrCountry;
	}

	@FindBy(id = "(//*[@class='icon-close'])[3]")
	@CacheLookup
	private WebElement iconclose;

	public WebElement iconclose() {
		return iconclose;
	}

	public WebElement CloseWindwoX() {
		WebElement CloseX = driver.findElement(By.xpath("(//*[@class='icon-close'])[3]"));
		js.executeScript("arguments[0].click();", CloseX);
		return CloseX;
	}

	public void EnterRegistrationInfo(String firstname, String lastname, String email, String phonenumber,
			String company, String address, String city, String zipcode, String state, String country)
			throws Throwable {
		EnetrFirstName.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		EnetrFirstName.sendKeys(firstname);
		EnetrLastName.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		EnetrLastName.sendKeys(lastname);
		EnetrEmail.sendKeys(email);

		EnetrPhoneNum.sendKeys(phonenumber);
		EnetrComoanyName.sendKeys(company);
		EnetrAddress.sendKeys(address);

		EnetrCity.sendKeys(city);
		EnetrPostalCode.sendKeys(zipcode);
		EnetrState.sendKeys(state);
		EnetrCountry.sendKeys(country);
	}

	// Scroll down & click element
	public WebElement doYouTakeAYear() {
		WebElement Click = driver.findElement(By.xpath("(//*[text()='Please select one'])[1]"));
		js.executeScript("arguments[0].click();", Click);
		return Click;

	} //

	public WebElement selectYear() {
		WebElement Year = driver
				.findElement(By.xpath("//*[@id='How_Many_Private_Flights_Per_Year__c-clone0']/descendant::li[2]/p"));
		js.executeScript("arguments[0].click();", Year);
		return Year;
	}

	public WebElement TravelWithPets() throws Throwable {
		Thread.sleep(1000);
		WebElement pets = driver.findElement(
				By.xpath("//*[@id='Do_you_have_a_need_to_travel_with_pets__c-clone']/descendant::span[2]"));
		js.executeScript("arguments[0].click();", pets);
		return pets;

	}

	// Scroll down & click element
	public WebElement selecttraveltosecondhome() {
		WebElement traveltosecondhome = driver.findElement(By.xpath("(//*[text()='Please select one'])[1]"));
		js.executeScript("arguments[0].scrollIntoView();", traveltosecondhome);
		js.executeScript("arguments[0].click();", traveltosecondhome);
		return traveltosecondhome;
	}

	public WebElement traveltosecondhome() {
		WebElement home = driver.findElement(
				By.xpath("//*[@id='Do_you_own_or_travel_to_a_second_home__c-cloneYes']/descendant::li[2]/p"));
		js.executeScript("arguments[0].click();", home);
		return home;
	}

	@FindBy(xpath = "//*[@id='Second_Home_State__c-clone']")
	@CacheLookup
	private WebElement SecondHomeState;

	public WebElement SecondHomeState() {
		return SecondHomeState;
	}

	public WebElement CurrentlyFly() {
		WebElement CloseX = driver
				.findElement(By.xpath("//*[@id='How_does_the_Lead_currently_Travel__c-clone']/descendant::span[6]"));
		js.executeScript("arguments[0].click();", CloseX);
		return CloseX;
	}

	// Scroll down & click element
	public WebElement MembershipInterested() {
		WebElement Membership = driver
				.findElement(By.xpath("//*[@id='Product_Interest__c-clone']/descendant::span[4]"));
		js.executeScript("arguments[0].scrollIntoView();", Membership);
		js.executeScript("arguments[0].click();", Membership);
		return Membership;
	}

	// Scroll down & click element
	public WebElement HowHearAboutUS() {
		WebElement About = driver.findElement(By.xpath("(//*[text()='Please select one'])[1]"));
		js.executeScript("arguments[0].scrollIntoView();", About);
		js.executeScript("arguments[0].click();", About);
		return About;
	}

	@FindBy(xpath = "//*[text()='Advertisement']")
	@CacheLookup
	private WebElement SelectAboutUS;

	public WebElement SelectAboutUS() {
		return SelectAboutUS;
	}

	@FindBy(xpath = "//*[@id='WebFormComment__c-clone']/descendant::div/textarea")
	@CacheLookup
	private WebElement EnterQustionsOrAnswerd;

	public WebElement EnterQustionsOrAnswerd() {
		return EnterQustionsOrAnswerd;
	}

	@FindBy(xpath = "//*[text()='Submit']")
	@CacheLookup
	private WebElement ClicOnSubmit;

	public WebElement ClicOnSubmit() {
		return ClicOnSubmit;
	}

}
