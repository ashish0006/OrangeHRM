/**
 * 
 */
package orangeTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author prakash
 *
 */
public class ExecuteLeadsOrange {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
			//	System.setProperty("webdriver.chrome.driver","tci\\relatative files\\chromedriver.exe");
				System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");					
				WebDriver driver;
				driver=new FirefoxDriver();
			//login in open source crm
				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
				driver.findElement(By.cssSelector("input[id='txtPassword'")).sendKeys("admin123");
				driver.findElement(By.name("Submit")).click();
			// about crm
				//driver.findElement(By.xpath("//img[@src='/webres_5cfea87b4387f2.35910947/themes/default/images/logo.png']")).click();
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[1]")).click();
				// logout in crm	
				//driver.findElement("By")
			//driver.close();
				
			
				
				
				//System.out.println("a");
				
			}
			
		}
