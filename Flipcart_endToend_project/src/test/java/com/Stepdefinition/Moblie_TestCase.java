package com.Stepdefinition;

import com.Pages.SearchPage;
import com.baseClass.Library;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;

public class Moblie_TestCase extends Library {
	 SearchPage sp;
	@Given("launch the flipkart application")
	public void launch_the_flipkart_application() {
		launchApplication();
	}

	@When("close the popup")
	public void close_the_popup() {
		System.out.println(driver.getTitle());
	  
	}

	@Then("it should navigate to home page")
	public void it_should_navigate_to_home_page() {
	 sp = new SearchPage(driver);
	 sp.homeScreen();
	}

	@Given("user enter the text in the search field")
	public void user_enter_the_text_in_the_search_field() {
		sp.search("mobile");
	  
	}

	@When("click the search field")
	public void click_the_search_field() {
	   sp.clickSearch("bbc");
	}

	@Then("it should be navigate to the search result page and display the relevant details")
	public void it_should_be_navigate_to_the_search_result_page_and_display_the_relevant_details() {
	  sp.Result();
	}




}
