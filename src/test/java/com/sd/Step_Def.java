package com.sd;

import java.io.IOException;
import java.util.Optional;

import org.openqa.selenium.WebDriver;

import com.base.Base_Class;
import com.configuration.helper.Configuration_Reader_Adactin;
import com.configuration.helper.File_Reader_Manager;
import com.cucu.pro.Test_Runner;
import com.helper.manager.Page_Object_Manager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public class Step_Def extends Base_Class {

	public static WebDriver driver = Test_Runner.driver;

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	
	@Before
	public static void before_Hooks(Scenario s) {

		String name = s.getName();
		System.out.println("Scenario name :"+name);
	}
	
	@After
	public static void after_Hooks(Scenario s) throws Exception {

		if (s.isFailed()) {
			
			TakesScreenshot("C:\\Users\\suresh\\Cucumber_Adactinhotel\\Screenshot/suresh.png");
			
		}
		
		Status status = s.getStatus();
		System.out.println("Scenerio status :"+status);
 	}
	
	
	
	
	
	
	

	@Given("user Launch The Application")
	public void user_launch_the_application() throws IOException {
		String url = File_Reader_Manager.get_Instance_FRM().get_Instance_Adaction().get_Config_Adactin_Url();
		getUrl(url);

	}

	@When("user Enter The Username In {string} Field")
	public void user_enter_the_username_in_field(String username){
		inputValueElement(pom.get_instance_login().getUsernmae(),username);
	}

	@When("user Enter the Password In {string} Field")
	public void user_enter_the_password_in_field(String pass) {

		inputValueElement(pom.get_instance_login().getPass(),pass);
	}

	@Then("user Click On The Login Button And It Navigates to Search Hotel Page")
	public void user_click_on_the_login_button_and_it_navigates_to_search_hotel_page() throws Exception {

		clickonElement("click", pom.get_instance_login().getLogin());
		waitbrowser("wait", 10);
	}

	@When("user Select The {string}")
	public void user_select_the(String city)
	{
		dropdown("byvalue", pom.get_instance_firstpage().getLocation(), city);
		
	}

	@When("user Select The Hotel")
	public void user_select_the_hotel() {
		
		dropdown("byindex", pom.get_instance_firstpage().getHotels(), "2");
	}

	@When("user Select The Room Type")
	public void user_select_the_room_type() {
		dropdown("bytext", pom.get_instance_firstpage().getRoomtype(), "Standard");
		
	}

	@When("user Select The No Of Rooms")
	public void user_select_the_no_of_rooms() {
		dropdown("byvalue", pom.get_instance_firstpage().getRoomnos(), "2");
	}

	@When("user Enter The Checkin Date")
	public void user_enter_the_checkin_date() throws IOException {
		
		clickonElement("clear", pom.get_instance_firstpage().getDatein());
		inputValueElement(pom.get_instance_firstpage().getDatein(),
				test_CaseData("C:\\Users\\suresh\\Cucumber_Adactinhotel\\Test case.xlsx", 1, 8, 5));
	}

	@When("user Enter The Checkout Date")
	public void user_enter_the_checkout_date() throws IOException {
		clickonElement("clear", pom.get_instance_firstpage().getDateout());
		inputValueElement(pom.get_instance_firstpage().getDateout(),
				test_CaseData("C:\\Users\\suresh\\Cucumber_Adactinhotel\\Test case.xlsx", 1, 9, 5));
		
	}

	@When("user Select The No Of Adults")
	public void user_select_the_no_of_adults() {
		dropdown("byvalue", pom.get_instance_firstpage().getAdult(), "1");
	}

	@When("user Select The No Of Children")
	public void user_select_the_no_of_children() {
		dropdown("byindex", pom.get_instance_firstpage().getChild(), "1");
	}

	@Then("user Click On the Search Button And It Navigate To Select Hotel Page")
	public void user_click_on_the_search_button_and_it_navigate_to_select_hotel_page() {
		
		clickonElement("click", pom.get_instance_firstpage().getSubmit());
	}

	@When("User Click on the Select radio Button")
	public void user_click_on_the_select_radio_button() {
		
		clickonElement("click", pom.get_instance_firstpage().getSelect());
	}

	@Then("user Click on the Search Button And It Navigate To Book AHotel Page")
	public void user_click_on_the_search_button_and_it_navigate_to_book_a_hotel_page() {
		clickonElement("click", pom.get_instance_firstpage().getSelect1());
	}

	@When("user Enter the First Name")
	public void user_enter_the_first_name() throws IOException {
		inputValueElement(pom.get_instance_booking().getFname(),
				test_CaseData("C:\\Users\\suresh\\Cucumber_Adactinhotel\\Test case.xlsx", 1, 15, 5));
		
	}

	@When("user Enter the Last Name")
	public void user_enter_the_last_name() throws IOException {
		inputValueElement(pom.get_instance_booking().getLname(),
				test_CaseData("C:\\Users\\suresh\\Cucumber_Adactinhotel\\Test case.xlsx", 1, 16, 5));
	
	}

	@When("user Enter The Billing Address")
	public void user_enter_the_billing_address() throws IOException {
		inputValueElement(pom.get_instance_booking().getAddress(),
				test_CaseData("C:\\Users\\suresh\\Cucumber_Adactinhotel\\Test case.xlsx", 1, 17, 5));
	
	}

	@When("user Enter The Credit Card Detail")
	public void user_enter_the_credit_card_detail() throws IOException {
		inputValueElement(pom.get_instance_booking().getCardnumber(),
				test_CaseData("C:\\Users\\suresh\\Cucumber_Adactinhotel\\Test case.xlsx", 1, 18, 5));

	}

	@When("user Select Card Type")
	public void user_select_card_type() {
		dropdown("byindex", pom.get_instance_booking().getCardtype(), "3");

	
	}

	@When("user Select Expiry Date And Year")
	public void user_select_expiry_date_and_year() {
		dropdown("byvalue", pom.get_instance_booking().getExpmonth(), "3");
		dropdown("bytext", pom.get_instance_booking().getExpyear(), "2022");
	}

	@When("user Enter The CVV Number")
	public void user_enter_the_cvv_number() throws IOException {
		inputValueElement(pom.get_instance_booking().getCvvnum(),
				test_CaseData("C:\\Users\\suresh\\Cucumber_Adactinhotel\\Test case.xlsx", 1, 21, 5));
		
	}

	@When("user Click on the Booknow Button And It Navigate To Booking Confirmation page")
	public void user_click_on_the_booknow_button_and_it_navigate_to_booking_confirmation_page() {
		clickonElement("click", pom.get_instance_booking().getBooknow());
		
	}

     @Then("user Click The Logout Button")
     public void user_click_the_logout_button() {
    	 clickonElement("click", pom.get_instance_booking().getLogout());
}

}
