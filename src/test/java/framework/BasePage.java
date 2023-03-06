package framework;

import framework.elements.Label;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Date;

import static framework.Browser.waitForPageToLoad;

public class BasePage {
    protected By pageLocator;
    protected String title;
    //protected PropertyReader propertyReader = new PropertyReader("lod.properties");
    public BasePage(final By locator, final String pageTitle){
        init(locator,pageTitle);
        assertIsOpened();
    }
    public void init(final By locator, final String pageTitle){
        pageLocator = locator;
        title = pageTitle;
    }
    public void assertIsOpened(){
        long before = new Date().getTime();
        Label elem = new Label(pageLocator, title);
        //Assert.assertTrue(elem.isDisplayed(), String.format("ERROR: Страница '%s' не была загружена!!!", title));
        try{
            elem.isElementPresent();
            waitForPageToLoad();
            long openTime = new Date().getTime() - before;
            System.out.println(String.format("Form '%1$s' appears",title) + String.format("in %s msec", openTime));
        } catch (Throwable e){
            Assert.assertTrue(true, title + "does not open");
        }
    }
}
