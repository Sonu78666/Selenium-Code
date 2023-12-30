package practice.sele.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ShadowDomNew {

	public static void main(String[] args) {
		
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		//WebElement find=driver.findElement(By.cssSelector("#userName"));
		//SearchContext root1=find.getShadowRoot();
		//root1.findElement(By.cssSelector("#kils")).sendKeys("sponu");
		
		//WebElement find1=driver.findElement(By.cssSelector("#app2"));
		//root1.findElement(By.cssSelector("div#app2 #pizza")).sendKeys("monu");

	    /*WebElement shadowHost = driver.findElement(By.cssSelector("#shadow_host"));
	    SearchContext shadowRoot = shadowHost.getShadowRoot();
	    WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#shadow_content"));
	    String s=shadowContent.getText();
	    System.out.println(s);*/
		
		WebElement main=driver.findElement(By.xpath("(//td[text()='ESS'])[1]"));
		driver.findElement(RelativeLocator.with(By.xpath("(//input[contains(text(),ohrmList_chkSelectRecord_25)])[15]")).toLeftOf(main)).click();
	}

}
