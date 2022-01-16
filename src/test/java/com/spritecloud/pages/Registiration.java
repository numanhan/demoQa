package com.spritecloud.pages;

import com.spritecloud.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.spritecloud.constant.Constants.*;

public class Registiration extends BasePage {

    public Registiration(WebDriver driver) {
        super(driver);
    }

    public void openBookStore(){
        clickElement(BOOK_STORE);
    }

    public void loginPage(){
        clickElement(LOGIN_BTN);
    }

    public void newUser(){
        clickElement(NEW_USER_BTN);
    }

    public void fillFirstName(){
        sendKeys(FIRST_NAME , "Numanhan");
    }

    public void fillLastName(){
        sendKeys(LAST_NAME, "Duran");
    }

    public void fillUserName(){
        sendKeys(USER_NAME, "numanhanduran");
    }

    public void fillPasword(){
        sendKeys(PASSWORD, "1234Qwer!!");
    }

    public void recaptcha(){
        clickElement(RECAPTCHA);
    }

    public void clickRegister(){
        clickElement(REGISTER_BTN);
    }
}
