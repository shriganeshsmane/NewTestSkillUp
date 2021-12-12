package skillup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.excel.utility.Xls_Reader;

public class parameterizedtest {

	//@Test
	//public static void test() 
	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

		Xls_Reader reader=new Xls_Reader("C:\\Users\\ShreeJi Academy\\eclipse-workspace\\NewTestSkillUp\\src\\com\\testdata\\50 Sample Test data.xlsx");
	    
		//int rowCount=reader.getRowCount("TestData");
		//System.out.println(rowCount);
		
		//PARAMETERIZATION CODE.........
		
		for(int rowNum=2;rowNum<=50;rowNum++)
		{
			String First_Name=reader.getCellData("TestData", "First_Name", rowNum);
			System.out.println(First_Name);
			
			String Last_Name=reader.getCellData("TestData", "Last_Name", rowNum);
			System.out.println(Last_Name);
			
			String Phone=reader.getCellData("TestData", "Phone", rowNum);
			System.out.println(Phone);
			
			String Email=reader.getCellData("TestData", "Email", rowNum);
			System.out.println(Email);
			
			String Address=reader.getCellData("TestData", "Address", rowNum);
			System.out.println(Address);
			
			String City=reader.getCellData("TestData", "City", rowNum);
			System.out.println(City);

			String State=reader.getCellData("TestData", "State", rowNum);
			System.out.println(State);
			
			String Postal_Code=reader.getCellData("TestData", "Postal_Code", rowNum);
			System.out.println(Postal_Code);
			
			String Country=reader.getCellData("TestData", "Country", rowNum);
			System.out.println(Country);
			
			String User_Name=reader.getCellData("TestData", "User_Name", rowNum);
			System.out.println(User_Name);
			
			String Password=reader.getCellData("TestData", "Password", rowNum);
			System.out.println(Password);
			
			String Confirm_Password=reader.getCellData("TestData", "Confirm_Password", rowNum);
			System.out.println(Confirm_Password);
			
			//WEB DRIVER CODE
			
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/test/newtours/login.php");
			
			driver.findElement(By.cssSelector("p > font > a")).click();
			   
			driver.findElement(By.name("firstName")).click();
		    driver.findElement(By.name("firstName")).sendKeys(First_Name);
		   
		    driver.findElement(By.name("lastName")).click();
		    driver.findElement(By.name("lastName")).sendKeys(Last_Name);
		
		    driver.findElement(By.name("phone")).sendKeys(Phone);
		
		    driver.findElement(By.id("userName")).sendKeys(Email);
		   
		    driver.findElement(By.name("address1")).click();
		    driver.findElement(By.name("address1")).sendKeys(Address);
		   
		    driver.findElement(By.name("city")).click();
		    driver.findElement(By.name("city")).sendKeys(City);
		    
		    driver.findElement(By.name("state")).click();
		    driver.findElement(By.name("state")).sendKeys(State);
		    
		    driver.findElement(By.name("postalCode")).click();
	        driver.findElement(By.name("postalCode")).sendKeys(Postal_Code);
		  
	        driver.findElement(By.name("country")).click();
		    new Select(driver.findElement(By.name("country"))).selectByVisibleText(Country);
		    driver.findElement(By.xpath("//tr[13]/td[2]")).click();
		   
		    driver.findElement(By.id("email")).click();
		    driver.findElement(By.id("email")).sendKeys(User_Name);
		   
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys(Password);
		   
		    driver.findElement(By.name("confirmPassword")).click();
		    driver.findElement(By.name("confirmPassword")).sendKeys(Confirm_Password);
		   
		    driver.findElement(By.name("submit")).click();
			
			driver.close();
	    }
	}
}
