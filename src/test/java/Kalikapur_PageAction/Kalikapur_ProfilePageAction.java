package Kalikapur_PageAction;

import org.testng.Assert;

import Kalikapur_PageLocator.Kalikapur_HomePageLocator;
import Kalikapur_PageLocator.Kalikapur_ProfilePageLocator;
import Kalikapur_Utility.Kalikapur_Base;
import Kalikapur_Utility.Kalikapur_Utiliti;

public class Kalikapur_ProfilePageAction extends Kalikapur_Base{
	Kalikapur_ProfilePageLocator kalikapur_ProfilePageLocator= new Kalikapur_ProfilePageLocator();
	
	public void VerifyUsercanLoginSuccessfully() throws Exception {
		Thread.sleep(5000);
		boolean Profileverification=kalikapur_ProfilePageLocator.KalProfile.isDisplayed();
		Assert.assertTrue(Profileverification);
		Kalikapur_Utiliti.takeMyScreenshot(driver, "Profile Page");
	}
	public void Logoutthesite() throws Exception {
		Thread.sleep(3000);
		kalikapur_ProfilePageLocator.KalLogout.click();
		Thread.sleep(3000);
	}
	
}

