package Kalikapur_StepDeffination;

import Kalikapur_PageAction.Kalikapur_HomePageAction;
import Kalikapur_PageAction.Kalikapur_SignupPageAction;
import Kalikapur_Utility.Kalikapur_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Kalsignup_StepDeffination extends Kalikapur_Base{
	Kalikapur_HomePageAction kalikapur_HomePageAction =new Kalikapur_HomePageAction();
	Kalikapur_SignupPageAction kalikapur_SignupPageAction= new Kalikapur_SignupPageAction();

	@Then("^Click on Signup Link$")
	public void click_on_Signup_Link() throws Throwable {
		kalikapur_HomePageAction.ClickonSignupLink();
	}

	@Then("^Enter Kaluser Name and Password and Click Signup$")
	public void enter_Kaluser_Name_and_Password_and_Click_Signup() throws Throwable {
		kalikapur_SignupPageAction.EnterKaluseNameandPasswordandClickSignup();
	}

	@Then("^Verify Kaluser can Signup$")
	public void verify_Kaluser_can_Signup() throws Throwable {
		kalikapur_HomePageAction.VerifyKalusercanSignup();
	}


}
