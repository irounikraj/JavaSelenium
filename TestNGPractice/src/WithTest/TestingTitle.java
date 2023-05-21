package WithTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingTitle {
@Test
	public void Testingtitle() 
	{
		ChromeDriver driver =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumud\\OneDrive\\Desktop\\Rubik\\chromedriver");
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		String  title="Electronics, Cars, Fashion, Collectibles & More | eBay";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, title);
		
		
	}
}
