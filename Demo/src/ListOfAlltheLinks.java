import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfAlltheLinks {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumud\\OneDrive\\Desktop\\Rubik\\chromedriver");
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		System.out.println("total no of tags are: " +alltags.size());
		
		for(int i=0; i<alltags.size();i++)
		{
		System.out.println("Links on the pages are:"+alltags.get(i).getAttribute("href"));
		System.out.println("Links on the pages are:"+alltags.get(i).getText());

	}

}
}