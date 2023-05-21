import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlyPartOprions {

	public class ListOfDdown {

		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumud\\OneDrive\\Desktop\\Rubik\\chromedriver");
			driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
			// driver.findElement(By.xpath("/html/body/div[1]/hgf-c360nav")).click();
//	WebElement ddown=	driver.findElement(By.xpath("//*[@id=\"CompanyEmployees-x0Vh\"]"));

			// Select select = new Select(ddown);
			// select.

			List<WebElement> allOptions = driver.findElements(By.name("UserTitle"));
			System.out.println("List of Total no of options on the page are" + allOptions.size());

			for (int i = 0; i < allOptions.size(); i++) {
				System.out.println("List of options are" + allOptions.get(i).getAttribute("value"));

			}

		}
	}
}
