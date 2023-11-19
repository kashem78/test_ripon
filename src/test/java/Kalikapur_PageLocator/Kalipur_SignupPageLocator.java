package Kalikapur_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Kalikapur_Utility.Kalikapur_Base;

public class Kalipur_SignupPageLocator extends Kalikapur_Base {

	public Kalipur_SignupPageLocator() {
		PageFactory.initElements(driver, this);
		
		}
		@FindBy(id ="sign-username")
		public WebElement KalSignUpUsername;
		
		@FindBy(id ="sign-password")
		public WebElement KalSignupPassword;
		
		
		@FindBy(xpath ="//button[text()='Sign up']")
		public WebElement KalSignUpButton ;
		
}
