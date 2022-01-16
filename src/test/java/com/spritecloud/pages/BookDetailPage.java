package com.spritecloud.pages;

import com.spritecloud.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.spritecloud.constant.Constants.*;

public class BookDetailPage extends BasePage {
    public BookDetailPage(WebDriver driver) {
        super(driver);
    }

    public void openBookStore(){
        clickElement(BOOK_STORE);
    }

    public void bookListPage(){
        clickElement(BOOK_STORE_LIST);
    }

    public void chooseBook(){
        clickElement(GIT_BOOK);
    }

    public String getTitle(){
        return getText(BOOK_TITLE);
    }
}
