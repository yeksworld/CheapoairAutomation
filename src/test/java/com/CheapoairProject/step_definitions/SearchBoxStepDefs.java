package com.CheapoairProject.step_definitions;

import com.CheapoairProject.pages.SearchNowPage;
import com.CheapoairProject.utilities.BrowserUtilities;
import com.CheapoairProject.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchBoxStepDefs {

    SearchNowPage searchNowPage =new SearchNowPage();

    @Given("i should be able to clear the default content")
    public void i_should_be_able_to_clear_the_default_content() {
        searchNowPage.ClearButton.click();

    }

    @Then("i should be able to send {string} to From inputbox")
    public void i_should_be_able_to_send_to_From_inputbox(String fra) {
       searchNowPage.From.sendKeys(fra);

    }

    @Then("i should be able to see all suggested airports from the list")
    public void i_should_be_able_to_see_all_suggested_airports_from_the_list() {
        BrowserUtilities.wait(1);

        List<String> options = BrowserUtilities.getElementsText(searchNowPage.FromList);
        System.out.println(options);


    }
    @When("i should be able to select the Brazil airport from the list")
    public void i_should_be_able_to_select_the_Brazil_airport_from_the_list() {

        while (!searchNowPage.WebelementFocused.getText().contains("Brazil")){
            searchNowPage.From.sendKeys(Keys.ARROW_DOWN);
            BrowserUtilities.wait(1);
        }
        searchNowPage.From.sendKeys(Keys.ENTER);



    }



}
