package com.nike.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchSum {

    @FindBy(id = "TypeaheadSearchInput")
    private WebElement search;

    @FindBy(xpath ="//i[@class='g72-search fs24-nav-sm']")
    private WebElement searchButton;







}
