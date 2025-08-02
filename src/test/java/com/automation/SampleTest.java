package com.automation;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest extends BaseClass {

    @BeforeMethod
    public void setUp() {
        initializeBrowser("chromium");
    }

    @Test
    public void testGoogleSearchPageTitle() {
        navigateTo("https://www.google.com");
        System.out.println("Page Title: " + page.title());
        assert page.title().contains("Google");
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}
