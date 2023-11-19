package Kalikapur_PageAction;

import Kalikapur_PageLocator.Kalipur_SignupPageLocator;
import Kalikapur_Utility.Kalikapur_Base;
import Kalikapur_Utility.Kalikapur_TestData;

public class Kalikapur_SignupPageAction extends Kalikapur_Base{
	Kalipur_SignupPageLocator kalipur_SignupPageLocator = new Kalipur_SignupPageLocator();          
	
	public void EnterKaluseNameandPasswordandClickSignup() throws Exception {
		Thread.sleep(4000);
		kalipur_SignupPageLocator.KalSignUpUsername.sendKeys(Kalikapur_TestData.KalUsername2);
		kalipur_SignupPageLocator.KalSignupPassword.sendKeys(Kalikapur_TestData.KalPassword2);
		kalipur_SignupPageLocator.KalSignUpButton.click();
	}
}
