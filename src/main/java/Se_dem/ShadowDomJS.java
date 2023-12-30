package Se_dem;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ShadowDomJS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//h4[text()='Memory Test']")));
		
		WebElement username=(WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#kils\")");
		username.sendKeys("Sonu");
		js.executeScript("arguments[0].setAttribute('style','backgroud:yellow;border:2px solid red;')", username);
		WebElement pizza=(WebElement)js.executeScript(" return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")\r\n"
				+ "");
		pizza.sendKeys("PIZZa");
		//js.executeScript("arguments[0].click();", username);

	}

}
