package Se_dem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AuthenticationAlert {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		

	}

}
