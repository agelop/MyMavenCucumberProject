package com.cucumber.MyMavenCucumberProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Steps {
	
	WebDriver driver;
	WebElement RegisterLink;
	
	
	@Given("^This is my first given step$")
	public void this_is_my_first_given_step() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Navigate to the home screen");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dínamo-TI\\Downloads\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//	    throw new PendingException();
	}

	@When("^This is my second when step$")
	public void this_is_my_second_when_step() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on register");
		RegisterLink = driver.findElement(By.linkText("REGISTER"));
		RegisterLink.click();
		
//	    throw new PendingException();
	}

	@Then("^This is my third then step$")
	public void this_is_my_third_then_step() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Register screen displays");
		RegisterLink = driver.findElement(By.name("firstName"));
		if (!RegisterLink.isEnabled()) {
			System.out.println("Failed Test");
		
		}
		
		
		driver.quit();
//	    throw new PendingException();
	}

}
