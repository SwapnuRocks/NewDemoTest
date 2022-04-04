package demopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testclass {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\User\\Desktop\\Selinum Jas Data\\chromedriver_win32\\chromedriver.exe");
	//ChromeOptions options=new ChromeOptions();
	//options.addArguments("--incognito");
	//options.addArguments("--headless");
	//options.addArguments("--no-sandbox");
	//options.addArguments("--disable-dev-shm-usage");
	WebDriver driver=new ChromeDriver();
	
	//WebDriver driver = new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	
	}
}
