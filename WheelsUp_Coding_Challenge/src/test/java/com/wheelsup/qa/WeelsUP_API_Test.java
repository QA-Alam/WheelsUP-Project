package com.wheelsup.qa;

import org.testng.annotations.Test;
import com.basepage.BasePage;
import com.wheelsup.util.GenericLivery;


public class WeelsUP_API_Test  extends BasePage {

 /*
  * Exercise 3 - Api testing (use any library or framework)
  *- Create a method called “verifySocialAccounts(String twitter, String instagram)”
  *- Twitter “https://twitter.com/WheelsUp”
  *- Instagram “http://instagram.com/wheelsup8760”
  *- Use this point (https://marketingapi.wheelsup.com/api/initial-data/)
  *- Get the JSON response and parse it
  *- Verify if passed social accounts matches (Use any class assert)
  * Note: All 3 exercises must be part of one maven project. Once exercises are completed, upload to your personal Github account. For exercise 2 and 3. Make sure there’s no dependency failures. Whe should be able to download it and runnit with no issues.
  */	
	
		
	@Test
	public void testSocialAccount() {
		GenericLivery.verifySocialAccount(twitterURL, instagramURL);
	}}
