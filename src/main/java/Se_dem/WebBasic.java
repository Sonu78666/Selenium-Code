package Se_dem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebBasic {
	static WebDriver driver;

	public static void main(String[] args) {
		String name="chrome";
		BrowserUtil b=new BrowserUtil();
	    driver=b.init_Web(name);
		b.lauchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println("Launched  the borwser");
		System.out.println(b.getTitle());
		
		/*Way-1
		driver.findElement(By.id("input-email")).sendKeys("Sonu7866yadav@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Son@1996");
		*/
		/* Way-2
		WebElement email=driver.findElement(By.id("input-email"));
		WebElement pass=driver.findElement(By.id("input-password"));
		email.sendKeys("sss");
		email.sendKeys("asddasd");
		*/
		/*Way-3
		By email=By.id("input-email");
		By pass=By.id("input-password");
		WebElement em=driver.findElement(email);
		WebElement pid=driver.findElement(pass);
		em.sendKeys("sss");
		em.sendKeys("pass");
		*/
		
		/* Way-4 Generics+By locator
		By email=By.id("input-email");
		By pass=By.id("input-password");
		getElement(email).sendKeys("email");
		getElement(pass).sendKeys("pass");
		*/
		/* Way-5 Generics+By locator and generic for action
		By email=By.id("input-email");
		By pass=By.id("input-password");
		doSendKeys(email, "sonu");
		doSendKeys(pass, "pass");
		
		*/
		/*way-6
		By email=By.id("input-email");
		By pass=By.id("input-password");
		ElementUtil e=new ElementUtil(driver);
		e.doSendKeys(email, "email");
		e.doSendKeys(pass, "pss");
		*/
		

	}
	

}
