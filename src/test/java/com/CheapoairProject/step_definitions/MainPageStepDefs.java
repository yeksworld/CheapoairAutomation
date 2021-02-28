package com.CheapoairProject.step_definitions;

import com.CheapoairProject.pages.MainPage;
import com.CheapoairProject.utilities.BrowserUtilities;
import com.CheapoairProject.utilities.ConfigurationReader;
import com.CheapoairProject.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class MainPageStepDefs {
    MainPage mainPage = new MainPage();

    @Given("i should be able to see the Main Page")
    public void i_should_be_able_to_see_the_Main_Page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


    }

    @Then("i should be able to click cookies info bar")
    public void i_should_be_able_to_click_cookies_info_bar() {
        BrowserUtilities.waitForClickability(mainPage.AcceptCookies,5);
        try {
            mainPage.AcceptCookies.click();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @When("i should be able to click the one way radio button")
    public void i_should_be_able_to_click_the_one_way_radio_button() {
        mainPage.OneWay.click();

    }

    @When("i should be able to assert that round trip is not selected")
    public void i_should_be_able_to_assert_that_round_trip_is_not_selected() {
        Assert.assertTrue(mainPage.RoundTrip.isEnabled());


    }
}
