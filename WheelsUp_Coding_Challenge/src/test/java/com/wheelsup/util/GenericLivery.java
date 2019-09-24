package com.wheelsup.util;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

import com.basepage.BasePage;
import com.wheelsup.model.Membership;

public class GenericLivery extends BasePage{
	
	public static void verifySocialAccount(String twitter, String instagram) {

		Membership membership = given()
				.when()
				.get(refURL)
				.then()
				.statusCode(200)
				.assertThat().extract()
				.as(Membership.class);
		Assert.assertEquals(twitterURL, 
				membership
				.getKeys()
				.getTwitter(),
				twitter);
		Assert.assertEquals(instagramURL, 
				membership.
				getKeys()
				.getInstagram(), 
				instagram);	
		}

}
