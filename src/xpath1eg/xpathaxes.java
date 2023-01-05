package xpath1eg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathaxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramre\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        driver.manage().window().fullscreen();
        
        //x-path axes-self
        String text=driver.findElement(By.xpath("//a[contains(text(),'National Fertilizers')]//self::a")).getText();
         System.out.println(text);
         
         //parent node
        text= driver.findElement(By.xpath("//a[contains(text(),'National Fertilizers')]/parent::td")).getText();
         System.out.println(text);
         
         //child
         // we written multiple web elements from ancestor to child  so we use list web elements 
         List<WebElement> childs=driver.findElements(By.xpath("//a[contains(text(),'National Fertilizers')]//ancestor::tr/child::td"));
         System.out.println("number "+childs.size());

	}

}
