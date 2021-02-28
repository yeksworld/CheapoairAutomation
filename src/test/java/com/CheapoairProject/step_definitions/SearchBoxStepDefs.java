package com.CheapoairProject.step_definitions;

import com.CheapoairProject.pages.SearchNowPage;
import io.cucumber.java.en.*;

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
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
