package com.CheapoairProject.pages;

import com.CheapoairProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//a[@class='gdpr-close']")
    public WebElement AcceptCookies;

    @FindBy(id = "owFlight")
    public WebElement OneWay;

    @FindBy(id = "rtFlight1")
    public WebElement RoundTrip;


}
