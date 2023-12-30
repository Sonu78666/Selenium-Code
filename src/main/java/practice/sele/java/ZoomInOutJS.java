package practice.sele.java;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ZoomInOutJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String zoom="document.body.style.zoom='50%'";
		js.executeScript(zoom);
		
	}

}
