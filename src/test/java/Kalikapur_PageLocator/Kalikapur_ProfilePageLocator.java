package Kalikapur_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Kalikapur_Utility.Kalikapur_Base;

public class Kalikapur_ProfilePageLocator extends Kalikapur_Base{

	
	
	public Kalikapur_ProfilePageLocator() {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(id ="nameofuser")
	public WebElement KalProfile;
	
	@FindBy(id ="logout2")
	public WebElement KalLogout;
	
	
	@FindBy(xpath ="")
	public WebElement Ka;
}
