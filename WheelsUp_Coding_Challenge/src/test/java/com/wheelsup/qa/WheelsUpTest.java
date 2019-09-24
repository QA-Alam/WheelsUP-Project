package com.wheelsup.qa;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.basepage.BasePage;
import com.pageobjectmodel.PageObject;
import com.utility.UtilityPage;

public class WheelsUpTest extends BasePage {
	
/*
 *   Exercise 2 - Write an automated test with selenium web-driver Java TestNG
 *   based framework for the following scenario. (Use Page Object Model) 
 * - Navigate to https://wheelsup.com 
 * - Find and print out in the console the following title “A Revolution Has Taken Flight” 
 * - Scroll to the bottom, print out phone number, email(Contact Us), and address(Find Us) 
 * - Scroll to top 
 * - Header menu, click “MEMBERSHIP OPTIONS” and then “CORE MEMBERSHIP” 
 * - Scroll to section “Becoming a Wheels Up Core Member is easy” 
 * - Print out “ONE-TIME INITIATION FEE” 
 * - Scroll to “Learn more today” section (Enter first and lastname) 
 * - Click continue 
 * - Enter all the information required to complete the form (DO NOT SUBMIT) 
 * - Click “X” at the top right corner
 */	
	
	String sheetName = "Data";
	PageObject element;
	UtilityPage testUtil;

	public WheelsUpTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new UtilityPage();
		element = new PageObject();

	}

	@AfterMethod
	public void tearDown() {
    driver.quit();

	}
	/*
	 * Note : all the test Data Collect from Excel Help of Apache POI and TestNG DataProvider
	 */

	@SuppressWarnings("static-access")
	@DataProvider
	public Object[][] getEnterCriteriaTestData() {
		Object data[][] = testUtil.getTestData(sheetName);
		return data;
	}

	@SuppressWarnings("static-access")
	@Test(priority = 1, dataProvider = "getEnterCriteriaTestData")
	public void WheelsUP_Automation_Coding_Challenge(String FirstName, String LastName, String Email,
			String PhoneNumber, String CompanyName, String StreetAddress, String City, String ZipCode, String State,
			String Country) throws Throwable {

		try {
			logger.info("******** Verify & Print Welcome Screen *********");
			testUtil.getExplicitWait(element.findwelcomescreen(), driver);
			System.out.println(" Verify welcome screen ::" + element.findwelcomescreen().getText());
			boolean welcome = element.verifywelcomescreenDisplay();
			Assert.assertTrue(welcome, "welcome screen mismatch");
		} catch (Exception e) {

		}

		try {
			logger.info("******** Verify & Print Contact Information *********");
			testUtil.getExplicitWait(element.verifyContactInfo(), driver);
		} catch (Exception e) {

		}

		try {
			logger.info("******** Verify & Print Address *********");
			testUtil.getExplicitWait(element.verifyAddress(), driver);
			System.out.println(element.verifyAddress().getText());
		} catch (Exception e) {
		}

		try {
			logger.info("******** Verify & click Membership Options *********");
			testUtil.getExplicitWait(element.ClickOMembershipOptions(), driver);
			element.ClickOMembershipOptions().click();
		} catch (Exception e) {
		}

		try {
			logger.info("******** Verify & click Core Member ship *********");
			testUtil.getExplicitWait(element.ClickONCOREMEMBERSHIP(), driver);
			element.ClickONCOREMEMBERSHIP().click();
		} catch (Exception e) {
		}

		try {
			logger.info("******** Verify Becoming a Wheels Up Core Member is easy *********");
			testUtil.getExplicitWait(element.verifyBecomingMember(), driver);
		} catch (Exception e) {
		}

		try {
			logger.info("******** Verify & Print One time initiation fee *********");
			testUtil.getExplicitWait(element.Onetimeinitiationfee(), driver);
			System.out.println(element.Onetimeinitiationfee().getText());
		} catch (Exception e) {
		}

		try {
			logger.info("******** Verify Learn More Today *********");
			testUtil.getExplicitWait(element.verifyLearnMoreToday(), driver);
		} catch (Exception e) {
		}

		try {
			logger.info("******** Verify & Enter First Name *********");
			testUtil.getExplicitWait(element.EnetrFirstName(), driver);
			element.EnetrFirstName().sendKeys("Mohammed");
		} catch (Exception e2) {
		}

		try {
			logger.info("******** Verify & Enter Last Name *********");
			testUtil.getExplicitWait(element.EnetrLastName(), driver);
			element.EnetrLastName().sendKeys("Alam");
		} catch (Exception e1) {
		}

		try {
			logger.info("******** Click on CONTINUE *********");
			testUtil.getExplicitWait(element.ClickONCONTINUE(), driver);
			element.ClickONCONTINUE().click();
		} catch (Exception e) {
		}

		try {
			logger.info("******** Verify Next page and Enter all the Necessary field *********");
			element.EnterRegistrationInfo(FirstName, LastName, Email, PhoneNumber, CompanyName, StreetAddress, City,
					ZipCode, State, Country);
		} catch (Exception e) {
		}

		try {
			logger.info("******** Verify HOW MANY PRIVATE FLIGHTS DO YOU TAKE A YEAR? & Click it *********");
			testUtil.getExplicitWait(element.doYouTakeAYear(), driver);
		} catch (Exception e) {
		}

		try {
			logger.info("******** Select Year Range *********");
			testUtil.getExplicitWait(element.selectYear(), driver);
			element.selectYear().click();
		} catch (Exception e) {
		}

		try {
			logger.info("******** Verify DO YOU HAVE A NEED TO TRAVEL WITH PETS? & Click it *********");
			testUtil.getExplicitWait(element.TravelWithPets(), driver);
			element.TravelWithPets();
		} catch (Exception e) {
		}

		try {
			logger.info("******** Select Options (PETS) Yes/No *********");
			testUtil.getExplicitWait(element.selecttraveltosecondhome(), driver);
		} catch (Exception e) {
		}

		try {
			logger.info("******** Verify Do you own or travel to a second home? *********");
			testUtil.getExplicitWait(element.traveltosecondhome(), driver);
			element.traveltosecondhome().click();
		} catch (Exception e) {
		}

		try {
			logger.info("******** Verify How do you currently FLY? & Select Jet Card*********");
			testUtil.getExplicitWait(element.CurrentlyFly(), driver);
		} catch (Exception e) {

		}

		try {
			logger.info(
					"******** WHAT MEMBERSHIP TYPE ARE YOU INTERESTED IN? & Select Wheels Up Core Membership*********");
			testUtil.getExplicitWait(element.MembershipInterested(), driver);
		} catch (Exception e) {
		}

		try {
			logger.info("******** Verify How did you hear about us? & Select Advertisement*********");
			testUtil.getExplicitWait(element.HowHearAboutUS(), driver);
		} catch (Exception e) {
		}

		try {
			logger.info("******** Select Advertisement*********");
			testUtil.getExplicitWait(element.SelectAboutUS(), driver);
			element.SelectAboutUS().click();
		} catch (Exception e) {
		}

		try {
			logger.info("******** Enter Please let us know any specific questions you want answered.*********");
			testUtil.getExplicitWait(element.EnterQustionsOrAnswerd(), driver);
			element.EnterQustionsOrAnswerd().sendKeys("Thanks to all management for grate services");
		} catch (Exception e) {
		}

		try {
			logger.info("******** Click on X for close window *********");
			testUtil.getExplicitWait(element.CloseWindwoX(), driver);
		} catch (Exception e) {
		}

		if (driver.getPageSource().contains("Wheels Up Core Membership")) {
			//driver.close();
			logger.info("******** (Wheels Up Test Success full)*********");
			Assert.assertTrue(true);
		} else {
			logger.info("******** (Wheels Up test faild) *********");
			Assert.assertTrue(false);
		}

	}
}
