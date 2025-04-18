package com.vtiger.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    public WebDriver driver;
    @Given("use should be on login")
    public void use_should_be_on_login() {

        driver = new ChromeDriver();
        driver.get("http://localhost:100");



    }
    @When("user enter valid credentials")
    public void user_enter_valid_credentials() {
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");


    }
    @When("click on login button")
    public void click_on_login_button() {
        driver.findElement(By.name("Login")).click();

    }
    @Then("user should be navigated to home page")
    public void user_should_be_navigated_to_home_page() {

        driver.findElement(By.linkText("Home")).isDisplayed();

    }
    @Then("user can see the logout link")
    public void user_can_see_the_logout_link() {
        driver.findElement(By.linkText("Logout")).isDisplayed();

    }



    @When("user enter invalid credentials")
    public void user_enter_invalid_credentials() {
        driver.findElement(By.name("user_name")).sendKeys("admin12");
        driver.findElement(By.name("user_password")).sendKeys("admin12");

    }


    @Then("user should be navigated to login page")
    public void user_should_be_navigated_to_login_page() {
        driver.findElement(By.name("Login")).isDisplayed();

    }
    @Then("user can see the error message")
    public void user_can_see_the_error_message() {
        driver.findElement(By.xpath("//*[contains(text(), 'You must specify a valid username and password.')]")).isDisplayed();
        System.out.println("Ok");

    }

}
