package Kalikapur_PageAction;

import org.testng.Assert;

import Kalikapur_PageLocator.Kalikapur_HomePageLocator;
import Kalikapur_PageLocator.Kalikapur_LoginPageLocator;
import Kalikapur_PageLocator.Kalipur_SignupPageLocator;
import Kalikapur_Utility.Kalikapur_Base;

public class Kalikapur_HomePageAction extends Kalikapur_Base{
	
	
	Kalikapur_HomePageLocator kalikapur_HomePageLocator= new Kalikapur_HomePageLocator();                
	
	
	public void ClickKalLogin() {
		kalikapur_HomePageLocator.KalLoginLink.click();
		
	}
	public void ClickonSignupLink () {
		kalikapur_HomePageLocator.KalSignupLink.click();
	}
	public void VerifyKalusercanSignup() throws Exception {
		Thread.sleep(7000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		boolean Signupsuccess= kalikapur_HomePageLocator.KalSignupLink.isDisplayed();
		Assert.assertTrue(Signupsuccess);
		
		
		
	}
}
