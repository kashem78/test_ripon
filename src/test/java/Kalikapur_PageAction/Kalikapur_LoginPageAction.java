package Kalikapur_PageAction;

import Kalikapur_PageLocator.Kalikapur_LoginPageLocator;
import Kalikapur_Utility.Kalikapur_Base;

public class Kalikapur_LoginPageAction extends Kalikapur_Base{
	Kalikapur_LoginPageLocator kalikapur_LoginPageLocator = new Kalikapur_LoginPageLocator();              
	
	public void TypeusernamepasswordclickLogin(String U, String P) throws Exception {
		Thread.sleep(4000);
		kalikapur_LoginPageLocator.KalUserName.sendKeys("ripon1");
		kalikapur_LoginPageLocator.KalPassword.sendKeys("12345");
		kalikapur_LoginPageLocator.KalLoginButton.click();
		
	}
	
}
