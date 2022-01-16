package com.spritecloud.test;

import com.spritecloud.base.BaseTest;
import com.spritecloud.base.Log4j;
import com.spritecloud.pages.BookStoreSearch;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class BookStoreSearchTest extends BaseTest {

    private String bookName = "Git Pocket Guide";

    BookStoreSearch functions;

    @Step("User opens Book Store Website")
    public void before() {
        functions = new BookStoreSearch(getDriver());
        Log4j.info("User succesfully opened the main website");
    }

    @Step("User should able to open Book Store")
    public void bookStore() {
        functions.openBookStore();
        Log4j.info("User succesfully opened the Book Store Page");
    }

    @Step("User searchs book")
    public void searchBook(){
        functions.searchBook();
        Log4j.info("User able to search book");
    }

    @Step("User clicks search button")
    public void searchBtn(){
        functions.clickSearch();
        Log4j.info("User searchs book");
    }

    @Step("User compares book name")
    public void isBook(){
       String gitBook = functions.bookName();
        Assert.assertEquals(gitBook ,bookName );
        Log4j.info("Book name matched with searched book name");
    }
}
