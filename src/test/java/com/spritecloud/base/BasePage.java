package com.spritecloud.base;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30, 500);
    }

    public WebElement findElement(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElement(by);
    }
    public Actions getActions() {
        return new Actions(driver);
    }
    public void hoverElement(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        getActions().moveToElement(findElement(by)).build().perform();
    }
    public void clickElement(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }
    public String getText(By byElement) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(byElement)).getText();
    }

    public void sendKeys(By by, CharSequence text) {
        try {
            WebElement element = findElement(by);
            wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
        }catch (NoSuchElementException e) {
            Log4j.error(e.getMessage());
        }
    }

    public String getAttributeFor(By by){
        String item = wait.until(ExpectedConditions.presenceOfElementLocated(by)).getAttribute("id");
        return item;
    }
    public String getAttribute(By by){
        String item = wait.until(ExpectedConditions.presenceOfElementLocated(by)).getAttribute("src");
        return item;
    }
    public void scrollDownTillElement(By by){
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("argument[0].scrollIntoView(true)", element);
    }



}
