package com.spritecloud.test;

import com.spritecloud.base.BaseTest;
import com.spritecloud.base.Log4j;
import com.spritecloud.pages.Registiration;
import com.thoughtworks.gauge.Step;


public class RegistirationTest extends BaseTest {

    Registiration functions;

    @Step("User opens Website")
    public void before() {
        functions = new Registiration(getDriver());
        Log4j.info("User succesfully opened the main website");
    }

    @Step("User opens Book Store")
    public void bookStore() {
        functions.openBookStore();
        Log4j.info("User succesfully opened the Book Store Page");
    }

    @Step("User clicks Login")
    public void login() {
        functions.loginPage();
        Log4j.info("User clicked login page");
    }

    @Step("User clicks new user button")
    public void newUser() {
        functions.newUser();
        Log4j.info("User clicked new user button");
    }

    @Step("User types first name")
    public void firstName() {
        functions.fillFirstName();
        Log4j.info("User typed first name");
    }

    @Step("User types last name")
    public void lastName() {
        functions.fillLastName();
        Log4j.info("User typed last name");
    }

    @Step("User types username")
    public void userName() {
        functions.fillUserName();
        Log4j.info("User filled username input area");
    }

    @Step("User types password")
    public void passaword() {
        functions.fillPasword();
        Log4j.info("User typed password");
    }

    @Step("User confirm that user not robot")
    public void recaptchaControl(){
        functions.recaptcha();
        Log4j.info("User confirmed that user not robot");
    }

    @Step("User clicks Register button")
    public void registiration(){
        functions.clickRegister();
        Log4j.info("User clicked register button");
    }
}
