package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Signinfeature;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefination1 {
	
	public WebDriver driver;
	
	@Given("New User enter the valid url {string} and click on Register button")
	public void new_User_enter_the_valid_url_and_click_on_Register_button(String string) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(string);
		
		driver.manage().window().maximize();
		Signinfeature s = new Signinfeature(driver);
		s.register();
	  
	}

	@When("New user enter the Contact info FName {string} LName {string} Phone {string} Email {string}")
	public void new_user_enter_the_Contact_info_FName_LName_Phone_Email(String string, String string2, String string3, String string4) {
	    Signinfeature s =new Signinfeature(driver);
	    s.contactinfo(string, string2, string3, string4);
	}

	@When("Mailing Info Address {string} City {string} State {string} PCode {string}")
	public void mailing_Info_Address_City_State_PCode(String string, String string2, String string3, String string4) {
	   Signinfeature s = new Signinfeature(driver);
	   s.mailinginfo(string, string2, string3, string4);
	}

	@Then("New User enter the user information UName {string} Password {string} CPassword {string} and click Submit button.")
	public void new_User_enter_the_user_information_UName_Password_CPassword_and_click_Submit_button(String string, String string2, String string3) {
	 Signinfeature s = new Signinfeature(driver);
	 s.userinfo(string, string2, string3);
	}
	
	
	
	
	

}
