package com.spritecloud.pages;

import com.spritecloud.base.BasePage;
import org.openqa.selenium.WebDriver;
import static com.spritecloud.constant.Constants.*;

public class BookStoreSearch extends BasePage {
    public BookStoreSearch(WebDriver driver) {
        super(driver);
    }

    public void openBookStore(){
        clickElement(BOOK_STORE);
    }

    public void bookList(){
        clickElement(BOOK_STORE_LIST);
    }

    public void searchBook(){
        sendKeys(SEARCH_BOX, "Git");
    }

    public void clickSearch(){
        clickElement(SEARCH_BUTTON);
    }

    public String bookName(){
       return getText(GIT_BOOK);

    }
}
