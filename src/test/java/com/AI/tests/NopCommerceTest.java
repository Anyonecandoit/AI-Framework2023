package com.AI.tests;

import org.testng.annotations.Test;

import com.AI.pages.NopCommercepage;

public class NopCommerceTest extends BaseTest {


	@Test

	public void ncloginTest() throws Throwable {

		NopCommercepage np = new NopCommercepage();

		np.enterEmail().enterPassword().click();

	}
}
