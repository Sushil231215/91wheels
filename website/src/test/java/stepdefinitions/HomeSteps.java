package stepdefinitions;

import org.testng.Assert;

import base.BaseTest;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import pages.HomePage;
import utils.ConfigReader;

public class HomeSteps extends BaseTest {
    HomePage homepage;

    @Given("user open the browser and launch the web page")
    public void user_open_browser() {
        launchBrowser(ConfigReader.getProperty("url"));
        homepage = new HomePage(driver);
    }

    @Then("user should get web page title")
    public void user_should_get_title() {
        String title = homepage.getPageTitle();
        System.out.println("Page Title is: " + title);
        Assert.assertTrue(title.length() > 0, "Title is empty");
    }

}
