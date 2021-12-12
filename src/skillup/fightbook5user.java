package skillup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class fightbook5user {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Xls_Reader reader=new Xls_Reader("C:\\Users\\ShreeJi Academy\\eclipse-workspace\\NewTestSkillUp\\src\\com\\testdata\\50 Sample Test data.xlsx");

		for(int rowNum=2;rowNum<=6;rowNum++)
		{
				
			String User_Name=reader.getCellData("TestData", "User_Name", rowNum);
			System.out.println(User_Name);
			
			String Password=reader.getCellData("TestData", "Password", rowNum);
			System.out.println(Password);
			
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/test/newtours/index.php");
			//WEB DRIVER CODE   
			    driver.findElement(By.name("userName")).click();
			    driver.findElement(By.name("userName")).sendKeys(User_Name);
			    
			    driver.findElement(By.name("password")).click();
			    driver.findElement(By.name("password")).clear();
			    driver.findElement(By.name("password")).sendKeys(Password);
			    driver.findElement(By.name("submit")).click();
			 			
			
		    driver.findElement(By.linkText("Flights")).click();
		    driver.findElement(By.xpath("(//input[@name='tripType'])[2]")).click();
		    driver.findElement(By.name("passCount")).click();
		    new Select(driver.findElement(By.name("passCount"))).selectByVisibleText("3");
		    driver.findElement(By.name("fromPort")).click();
		    new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("New York");
		    driver.findElement(By.name("fromMonth")).click();
		    new Select(driver.findElement(By.name("fromMonth"))).selectByVisibleText("December");
		    driver.findElement(By.name("fromDay")).click();
		    driver.findElement(By.name("toPort")).click();
		    new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("Paris");
		    driver.findElement(By.name("toMonth")).click();
		    new Select(driver.findElement(By.name("toMonth"))).selectByVisibleText("December");
		    driver.findElement(By.name("toDay")).click();
		    new Select(driver.findElement(By.name("toDay"))).selectByVisibleText("14");
		    driver.findElement(By.cssSelector("font > font > input[name=\"servClass\"]")).click();
		    driver.findElement(By.name("airline")).click();
		    new Select(driver.findElement(By.name("airline"))).selectByVisibleText("Unified Airlines");
		    driver.findElement(By.name("findFlights")).click();
		    driver.findElement(By.cssSelector("td > a > img")).click();
			
						
			
			
			driver.close();
	    }
	
	}

}


