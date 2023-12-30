package Se_dem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserUtil {

	private WebDriver driver;

	public WebDriver init_Web(String Bro_name) {
		System.out.println("Borwser name is" + Bro_name);
		switch (Bro_name.toLowerCase().trim()) {
		case "chrome": {
			ChromeOptions option = new ChromeOptions();
	        option.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sonu7\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			
			driver = new ChromeDriver(option);
			break;
		}
		case "firefox": {

			System.out.println("Launch firefox");
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + Bro_name.toLowerCase());
			
		}
		return driver;
	}
	public void lauchUrl(String url)
	{
		if(url==null)
		{
			
		}
		if(url.indexOf("https")==0)
		{
			driver.get(url);
		}
		
		
	}
	
	public String getTitle()
	{
		driver.manage().window().maximize();
		String title=driver.getTitle();
		//System.out.println("title name is"+title);
		return title;
	}
	public void quit()
	{
		if(driver!=null)
		{
			driver.close();
		}
	}
}
