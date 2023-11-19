package Kalikapur_StepDeffination;

import Kalikapur_PageAction.Kalikapur_HomePageAction;
import Kalikapur_PageAction.Kalikapur_LoginPageAction;
import Kalikapur_PageAction.Kalikapur_ProfilePageAction;
import Kalikapur_Utility.Kalikapur_Base;
import Kalikapur_Utility.Kalikapur_Utiliti;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Kalikapur_Login extends Kalikapur_Base {
	Kalikapur_HomePageAction kalikapur_HomePageAction= new Kalikapur_HomePageAction();     
	Kalikapur_LoginPageAction kalikapur_LoginPageAction =new Kalikapur_LoginPageAction();
	Kalikapur_ProfilePageAction kalikapur_ProfilePageAction=new Kalikapur_ProfilePageAction();
	
	
	@Given("^Launch<\"([^\"]*)\">Kal$")
	public void launch_Kal(String URL) throws Throwable {
		KalLaunchURL(URL);
		Kalikapur_Utiliti.takeMyScreenshot(driver, "Home Page");
		
	}
	@Then("^Click KalLogin$")
	public void click_KalLogin() throws Throwable {
		kalikapur_HomePageAction.ClickKalLogin();
	
			
	}	
	@Then("^Type username password click Login$")
	public void type_username_password_click_Login() throws Throwable {
	kalikapur_LoginPageAction.TypeusernamepasswordclickLogin(KalPro.getProperty("KalUserName"), KalPro.getProperty("KalPassword")); 
	
	}
	@Then("^Verify User can Login Successfully$")
	public void verify_User_can_Login_Successfully() throws Throwable {
		kalikapur_ProfilePageAction.VerifyUsercanLoginSuccessfully();	
	}
	@Then("^Logout the site$")
	public void logout_the_site() throws Throwable {
		kalikapur_ProfilePageAction.Logoutthesite();
	}
	}
