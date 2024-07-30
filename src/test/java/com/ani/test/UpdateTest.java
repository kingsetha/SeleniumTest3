package com.ani.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;


class UpdateTest {
	
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@BeforeEach
	public void setUp() {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@AfterEach
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void testUpdateMovie1() {
		

//		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/EditR/1");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("mname")).click();
		driver.findElement(By.name("mname")).sendKeys("Pokiri");
		driver.findElement(By.name("type")).click();
		driver.findElement(By.name("type")).sendKeys("Action/Romantic");
		driver.findElement(By.name("timing")).click();
		driver.findElement(By.name("timing")).sendKeys("BJKK");
		driver.findElement(By.name("update")).submit();
        assertEquals("Data Updated Successfully","Data Updated Successfully");
	}
	@Test

	public void testUpdateCustomer1() {
//		WebDriver driver = new ChromeDriver();
	//AddCustomer Page
	driver.get("http://localhost:3000/update/5");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("cname")).sendKeys("Aji");
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("count")).sendKeys("15");
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("address")).sendKeys("Vallioor");
	driver.findElement(By.name("update")).submit();
    assertEquals("Data updated Successfully", "Data updated Successfully");
	}
	@Test
	public void testUpdateCustomer2() {
//		WebDriver driver = new ChromeDriver();
	//AddCustomer Page
	driver.get("http://localhost:3000/update/5");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("cname")).sendKeys("Aji");
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("count")).sendKeys("");
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("address")).sendKeys("Vallioor");
	driver.findElement(By.name("update")).submit();
    assertEquals("valid data needed", "valid data needed");
	}
	@Test
	public void testUpdateCustomer3() {
//		WebDriver driver = new ChromeDriver();
	//AddCustomer Page
	driver.get("http://localhost:3000/update/5");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("cname")).sendKeys("Micheal");
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("count")).sendKeys("5");
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("address")).sendKeys("");
	driver.findElement(By.name("update")).submit();
    assertEquals("valid data needed", "valid data needed");
	}

	@Test
	public void testUpdateCustomer4() {
//		WebDriver driver = new ChromeDriver();
	//AddCustomer Page
	driver.get("http://localhost:3000/update/5");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("cname")).sendKeys("");
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("count")).sendKeys("6");
	driver.findElement(By.name("cname")).click();
	driver.findElement(By.name("address")).sendKeys("Vallioor");
	driver.findElement(By.name("update")).submit();
    assertEquals("valid data needed", "valid data needed");
	}


}
