package mindtree.mavenProject2;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
    @Test
	public static void main(String[]args)throws NoAlertPresentException,InterruptedException
	{
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\mindsdet139\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("https://www.urbanladder.com/");
	     driver.findElement(By.id("search")).sendKeys("sofa");
	     driver.findElement(By.id("search_button")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/div[2]/a[1]")).click();
	     
	     driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[2]/div[1]")).click();
	      driver.findElement(By.className("radio")).click();
	     Thread.sleep(5000);
          driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[4]/div[1]")).click();
         driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[4]/div[2]/div/div/div/ul/li[1]/label")).click();
         Thread.sleep(5000);
         driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[5]/div[1]")).click();
         driver.findElement(By.xpath("//*[@id=\"filters-form\"]/div[1]/div/div/ul/li[5]/div[2]/div/div/div[1]/ul/li[1]/label")).click();
         Thread.sleep(5000);
         driver.close();
	}

}
