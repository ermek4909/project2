package com.cbt;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Order {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ""
				+ "/Users/ermekru/Documents/selenium dependencies/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
     	driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
     	
     	
     	 
     	Random rnd = new Random();
     	driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		driver.findElement(By.xpath("//a[.='Order']")).click();
		int qq=rnd.nextInt(99);
		String qq1=1+qq+"";
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys(qq1);
		
		String middleName="";
		
		for (int i = 0; i < 5; i++) {
			char midName= (char)(rnd.nextInt(26)+65);
			middleName+= midName+"";
		}
		String name="John "+ middleName+" Smith";
			
		
		
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(name);
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("123 Any st");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("Chicago");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Illinois");
		
		
		int zipCode = 0;
		String zC="";
		for (int i = 0; i < 5; i++) {
		zipCode= rnd.nextInt(9);
		zC+=zipCode+"";
		}
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(zC);
		
		
		WebElement visa=driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
		WebElement master=driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1"));
		WebElement amex=driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2"));
		WebElement cardN=driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
		String cardNumber="";
		
		int card=rnd.nextInt(2);
		
			switch(card) {
			case 0:
				visa.click();
				for (int j1 = 0; j1 < 15; j1++) {
					int visaN=rnd.nextInt(9);
					cardNumber+=visaN;
				}
				cardNumber="4"+cardNumber;
				cardN.sendKeys(cardNumber);
				break;
				
			case 1:
				master.click();
				for (int j2 = 0; j2 < 15; j2++) {
					int masterN=rnd.nextInt(9);
					cardNumber+=masterN;
				}
				cardNumber="5"+cardNumber;
				cardN.sendKeys(cardNumber);
				break;
			case 2:
				amex.click();
				for (int j3 = 0; j3 < 14; j3++) {
					int amexN=rnd.nextInt(9);
					cardNumber+=amexN;
				}
				cardNumber="3"+cardNumber;
				cardN.sendKeys(cardNumber);
				break;
			}
			driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("11/22");
			
			
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
			
		}
}
     	
//     	// 3 Login using username Tester and password test
//     	driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
//     	driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
//     	
////     	// 4 Click on Order link    	
//     	driver.findElement(By.id("ctl00_MainContent_login_button")).click();
//        driver.findElement(By.xpath("//a[.='Order']")).click();// xpath syntax for finding the element using text.
//     	
//    	// 5 Enter a random quantity between 1 and 100
////        driver.findElement(By.id(id)).
//        Random rd = new Random();
//        int temp = rd.nextInt(100);
//        String st = 1 + temp +"";
////        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys(" ");
//         driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys(st);
//        
//    	// 6 Enter Customer Name: John <middle_name> Smith. Instead of <middle_name> your code should enter a 
//         //random string every time.
//         int zipCode = 0;
// 		String zC="";
// 		for (int i = 0; i < 5; i++) {
// 		zipCode= rd.nextInt(9);
// 		zC+=zipCode+"";	 
//         }
//         driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(zC);
//         
//         
//         // 7 Enter street: 123 Any st
//         driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("123 Any st");
//         
//         //8 Enter City: Anytown
//         driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("Anytown");
//         
//         //9 Enter State: Virginia
//         driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Verginia");
//         
//         //10 Enter a random 5 digit number to the zip code field
//        String stZ= "";
//         for(int i = 0; i < 5; i++) {
//        	 int tempZ = rd.nextInt(5);
//        	  stZ += tempZ + "";	 
//         }
//         driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(stZ);
//         
//         // 11  Select any card type. Every time your code should select a different type.
//         // 12  Enter any card number. If you selected Visa, card number should start with 4.
//           // If you selected Master, card number should start with 5.
//           // If you selected American Express, card number should start with 3.
//           // New card number should be auto generated every time you run the test.
//           // Card numbers should be 16 digits for Visa and Master, 15 for American Express.
//     
//             int roll = 0;
//                 switch(roll) {
//                 case 0:
//                	 driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click(); //Visa
//                	     
//                	 String stV = "";
//                	 for(int i = 4; i < 10; i++) {
//                		 int tempV = rd.nextInt(10);
//                		 stV += tempV + "";
//                	 }
//                	 driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(stV);
//                	
//                	 driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("09/19");
//                	 
//                	 break;
//                	 
//                	 
//                	 
//                	 
//                	 
//                	 
//                 case 1:
//                	 driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1")).click();//MasterCard
//                	 
//                	 String stM = "";
//                	 for(int i = 5; i < 10; i++) {
//                	     int tempM = rd.nextInt(10);
//                		 stM += tempM + "";
//                	 }
//                	 driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(stM);
//                	 
//                	 driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("12/20");
//                	 
//                	 break;
//                	 
//                	 
//                	 
//                	 
//                	 
//                	 
//                	 
//                 case 2:
//                	 driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2")).click();//American Express
//                	  
//                	     String stA = "";
//                	       for(int i = 3; i < 16; i++) {
//                	    	   int tempA = rd.nextInt(12);
//                	    	   stA += tempA + "";
//                	       }
//                	       driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(stA);
//                	       
//                	       driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("12/21");
//                	       
//                	 break;
//                	 
//                 }
//            	 
//                
//         
//                 //14 Click on Process
//                 driver.findElement(By.xpath("//a[.='Process']")).click();
//                 
//    	
//     	
//	}
//
//}
