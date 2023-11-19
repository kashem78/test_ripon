package Kalikapur_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Kalikapur_Utility.Kalikapur_Base;

public class Kalikapur_LoginPageLocator extends Kalikapur_Base{


	public Kalikapur_LoginPageLocator() {
	PageFactory.initElements(driver, this);
	
	}
	@FindBy(id ="loginusername")
	public WebElement KalUserName;
	
	@FindBy(id ="loginpassword")
	public WebElement KalPassword;
	
	
	@FindBy(xpath ="//button[text()='Log in']")
	public WebElement KalLoginButton;
	
	
	
	
	
	
}
