import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumud\\OneDrive\\Desktop\\Rubik\\chromedriver");
driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
driver.getCurrentUrl();
		WebElement multi = driver.findElement(By.id("multi-select"));
		Select select =new Select(multi);
		select.selectByIndex(2);
		Thread.sleep(300);
		select.selectByValue("California");
		Thread.sleep(300);
		List <WebElement> allItems = select.getAllSelectedOptions();
		System.out.println(allItems.size());
		
		select.deselectAll();
		Thread.sleep(300);
		select.selectByValue("Ohio");
		select.selectByValue("Pennsylvania");
		System.out.println(allItems.size());
		
		
		
		
		

	}

}
