package uninove;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://aluno.uninove.br/");
		
		driver.findElement(By.xpath("//div//input[@id='user']")).sendKeys("inserir RA");
		
		driver.findElement(By.xpath("//div//input[@id='Password']")).sendKeys("Inserir senha");
		
		driver.findElement(By.xpath("//div//button[@id='BtnConf']")).click();
		
		driver.findElement(By.xpath("//div//img[@id='img-ava']")).click();
		
		driver.findElement(By.xpath("//div//ul//li//a//p[@ class='aba-categoria active']")).click();
		
		
		

		
		

	}

}


