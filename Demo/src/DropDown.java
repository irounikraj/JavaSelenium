import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown {
	
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumud\\OneDrive\\Desktop\\Rubik\\chromedriver");
	driver.get("https://www.sugarcrm.com/au/request-demo/");
	driver.manage().window().maximize();
	WebElement ddown= driver.findElement(By.xpath("//*[@id=\"how-select\"]"));
	Select select = new Select(ddown);
	
	select.selectByValue("Event");
	Thread.sleep(200);
	select.selectByVisibleText("Internet");
	
	Thread.sleep(200);

	
	}

}
