package TextScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class createCpage {
	public static void main(String[] args) throws IOException {
FileInputStream fis = new FileInputStream("./src/main/resources/LogincredentialNinza.properties");
		
		Properties pObj=new Properties();
		pObj.load(fis);
		
		String BROWSER= pObj.getProperty("browser");
		String URL= pObj.getProperty("url");
		String USERNAME= pObj.getProperty("username");	
		String PASSWORD= pObj.getProperty("password");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get(URL);
		
		WebElement userfield =driver.findElement(By.name("username"));
		userfield.sendKeys(USERNAME);
		WebElement passfield =driver.findElement(By.name("password"));
		passfield.sendKeys(PASSWORD);
		WebElement signinbtn=driver.findElement(By.xpath("//button[@type='submit']"));
		signinbtn.click();

	}

}
