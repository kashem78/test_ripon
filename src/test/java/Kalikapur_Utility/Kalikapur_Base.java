	package Kalikapur_Utility;

	import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

	public class Kalikapur_Base {
	
	public static WebDriver driver;
	public static Properties KalPro;
	
	
	
	public Kalikapur_Base () {
		try {
			 FileInputStream KalFle = new FileInputStream(System.getProperty("user.dir")+("//src//test//java//Kalikapur_Config//Kalikapur_Config.Properties"));                                              
			KalPro  = new 	Properties ();
			KalPro.load(KalFle);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Please, look the code");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
	public void KalBrowser()   {
		String KalAllBrowser =  KalPro.getProperty("KalBrowser1");
		if ( KalAllBrowser.equalsIgnoreCase("Chrome")) {
			System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+("//Kalikapur_ChromeDriver//chrome.exe"));
			ChromeOptions app = new ChromeOptions();
			app.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			
			
		}
		else if (KalAllBrowser.equalsIgnoreCase("Edge"))  {
			
			System.setProperty("Webdriver.edge.driver", System.getProperty("user.dir")+("//Kalikapur_EdgeDriver//msedgedriver.exe"));
			EdgeOptions eapp = new EdgeOptions();
			eapp.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Kalikapur_Utiliti.pageLoadTimeout));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Kalikapur_Utiliti.implicitlyWait));
			driver.manage().window().maximize();
							
							}
		
					}
		public static void KalLaunchURL(String URL) {
			driver.get(KalPro.getProperty("KalURL"));
		}
		}
	
