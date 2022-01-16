package com.spritecloud.constant;

import org.openqa.selenium.By;

public class Constants {

    public static final By BOOK_STORE = By.cssSelector("div[class='home-body']>div>div:nth-of-type(6)");
    public static final By LOGIN_BTN = By.id("login");
    public static final By NEW_USER_BTN = By.cssSelector("button[id='newUser']");
    public static final By FIRST_NAME = By.cssSelector("input[id='firstname']");
    public static final By LAST_NAME = By.cssSelector("input[id='lastname']");
    public static final By USER_NAME = By.cssSelector("input[id='userName']");
    public static final By PASSWORD = By.cssSelector("input[id='password']");
    public static final By RECAPTCHA = By.cssSelector("div[class='recaptcha-checkbox-border']");
    public static final By REGISTER_BTN = By.id("#register"); //(button[id='register'])
    //
    public static final By BOOK_STORE_LIST = By.cssSelector("div[class='element-list collapse show']>ul>li:nth-of-type(2)");
    public static final By SEARCH_BOX = By.id("searchBox");
    public static final By SEARCH_BUTTON = By.id("basic-addon2");
    //
    public static final By GIT_BOOK = By.xpath("//a[contains(@href, '/books?book=9781449325862')]");
    public static final By BOOK_TITLE = By.xpath("//label[@class='form-label' and contains(text() , 'Git Pocket Guide')]");
}
