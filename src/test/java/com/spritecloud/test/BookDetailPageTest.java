package com.spritecloud.test;

import com.spritecloud.base.BaseTest;
import com.spritecloud.base.Log4j;
import com.spritecloud.pages.BookDetailPage;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class BookDetailPageTest extends BaseTest {

    private String bookTitle1 = "Git Pocket Guide";

    BookDetailPage functions;

    @Step("User opens Book Store Page")
    public void before() {
        functions = new BookDetailPage(getDriver());
        Log4j.info("User succesfully opened the main website");
    }

    @Step("User clicks book store from list")
    public void bookListPage() {
        functions.openBookStore();
        Log4j.info("User succesfully opened the Book Store Page");
    }

    @Step("User chooses the first book from list")
    public void chooseBook(){
        functions.chooseBook();
        Log4j.info("User successfully choosed the book from list");
    }

    @Step("User make sure the right book choosen")
    public void bookChoose(){
        String bookTitle = functions.getTitle();
        Assert.assertEquals(bookTitle,bookTitle1 );
        Log4j.info("User ensure that choosen book matched");
    }
}
