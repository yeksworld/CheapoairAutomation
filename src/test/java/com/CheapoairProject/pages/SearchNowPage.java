package com.CheapoairProject.pages;

import com.CheapoairProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchNowPage {
    public SearchNowPage(){ PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[contains(@data-ember-action,'544')]")
    public WebElement ClearButton;

    @FindBy(id = "ember532")
    public WebElement From;

    //css class oldugu icin '.'
    //id olsaydi '#'
    @FindBy(css =".suggestion-box__menu.icon")
    public List<WebElement> FromList;

    @FindBy(css = ".focused")
    public WebElement WebelementFocused;



}
