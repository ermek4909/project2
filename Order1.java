package com.cbt;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Order1 {
	
	public static void main(String [] arsg) {
		
		System.setProperty("webdriver.chrome.driver",""
				+ "/Users/ermekru/Documents/selenium dependencies/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		//4
		driver.findElement(By.xpath("//a[.='Order']")).click();
		
		//5
		Random rd = new Random();
		int rn = rd.nextInt(100);
		 String srn = 1 + rn + "";
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys(srn);
		
		
		//6
		String sarr[] = {"Mike","Many","Erick","Adam","Bred","Emeli","Diana"};
		int r = rd.nextInt(6);
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(sarr[r]);
		
		//7
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("123 Any st");
		
		//8 
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("Anytown");
		
		//9 
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Virginia");
		
		//10
		String rnum = "";
		for (int i = 0; i < 5; i++) {
			int rz = rd.nextInt(10);
			rnum += rz + "";
		}
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(rnum);
		
		//11
		int num11 = rd.nextInt(3);
//		WebElement crads = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_"+num11+""));
//		crads.click();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_"+num11+"")).click();
	
		//12
		String cards = "";
		
		if(num11 == 0 ) {
			cards = "4";
			for(int i = 0; i < 15; i++) {
				cards += rd.nextInt(10);
			}
		} 
		
		
		else if(num11 == 1) {
			cards = "5";
			for(int i = 0; i < 15; i++) {
				cards += rd.nextInt(10);
			}
		}
		
		
		else if(num11 == 3) {
			cards = "3";
			for(int i = 0; i < 16; i++) {
				cards += rd.nextInt();
			}
		}
		
		
        driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys(cards);		
		//13
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("12/21");
		
		//14
		driver.findElement(By.xpath("//a[.='Process']")).click();
		
		
		
	}

}
