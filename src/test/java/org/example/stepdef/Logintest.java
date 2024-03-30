package org.example.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest {

    WebDriver driver;

    @Given("I am one the OpenCart login Page")
    public void i_am_one_the_open_cart_login_page() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

    }

    @Given("I have entered a valid username and password")
    public void i_have_entered_a_valid_username_and_password() {
        System.out.println("User entered credentials");
        driver.findElement(By.xpath("//input[@ id=\"input-email\"]")).sendKeys("ox@gmail.com");
        driver.findElement(By.xpath("//input[@ id=\"input-password\"]")).sendKeys("12345");

    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        System.out.println("Step3: USer is clicking on login button");
        driver.findElement(By.xpath("//input[@ value=\"Login\"]")).click();
    }

    @Then("I should be logged in Successfully")
    public void i_should_be_logged_in_successfully() {
        System.out.println("user logged");

    }

    @Given("I have entered invalid {string} and {string}")
    public void i_have_entered_invalid_and(String string, String string2) {

    }

    @Then("I should see an error message indicating {string}")
    public void i_should_see_an_error_message_indicating(String string) {
String s =driver.findElement(By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]")).getText();
s= driver.getTitle();
        System.out.println("The title is :" + s);
    }

    @When("I click on the {string} link")
    public void i_click_on_the_link(String string) {

    }

    @Then("I should be restricted to the password reset page")
    public void i_should_be_restricted_to_the_password_reset_page() {


    }
}