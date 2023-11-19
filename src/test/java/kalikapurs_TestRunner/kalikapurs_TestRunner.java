package kalikapurs_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Kalikapur_Utility.Kalikapur_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Kalikapur_Features"},
plugin = {"json:target/cucumber.json"},
glue = "Kalikapur_StepDeffination", tags = {"@Ripon, @Affan"})

// AbstractTestNGCucumberTests  
public class kalikapurs_TestRunner extends  AbstractTestNGCucumberTests{

	@BeforeTest
	public void KalStartURL() {
		Kalikapur_Base Kal = new Kalikapur_Base();
		Kal.KalBrowser();
	}
	@AfterTest
	 public void KalCloseURL () {
		Kalikapur_Base Kal = new Kalikapur_Base();
		 Kal.driver.quit();
	 }
	 
}




