package Kalikapur_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import Kalikapur_Utility.Kalikapur_Base;

public class Kalikapur_HomePageLocator extends  Kalikapur_Base{

	public Kalikapur_HomePageLocator() {
	PageFactory.initElements(driver, this);
	
	}
	@FindBy(id ="login2")
	public WebElement KalLoginLink;
	
	@FindBy(id ="signin2")
	public WebElement KalSignupLink;
	
	
	@FindBy(id ="")
	public WebElement uy;
	
	
	
	
	
		
	}

