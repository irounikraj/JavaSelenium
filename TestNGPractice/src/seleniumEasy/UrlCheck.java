package seleniumEasy;
import org.openqa.selenium.chrome.*;
public class UrlCheck {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumud\\OneDrive\\Desktop\\Rubik\\chromedriver");
	driver.get("http://demo.seleniumeasy.com");
	String CurrentUrl =driver.getCurrentUrl();
	System.out.println("the current url is :"+CurrentUrl);
	driver.manage().window().maximize();
	driver.close();

	}

}
