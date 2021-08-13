package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	WebDriver driver;
	
	@Given("user is on adactin webpage")
	public void user_is_on_adactin_webpage() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
	  
	}
	@When("user should enter the {string} and {string}")
	public void user_should_enter_the_and(String string, String string2) throws InterruptedException {
		Thread.sleep(2000);
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys(string);
		WebElement userPass = driver.findElement(By.id("password"));
		userPass.sendKeys(string2);
	   
	}

	@When("user should click login button")
	public void user_should_click_login_button() {
	   WebElement logn = driver.findElement(By.id("login"));
	   logn.click();
	}

    @When("user should select hotels by{string},{string},{string},{string},{string},{string},{string},{string}")
    public void user_should_select_hotels_by(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
       
    	WebElement noOfRooms = driver.findElement(By.id("location"));
        noOfRooms.sendKeys(string);
        
        WebElement hotel = driver.findElement(By.id("hotels"));
        hotel.sendKeys(string2);
        
        WebElement roomType = driver.findElement(By.id("room_type"));
        roomType.sendKeys(string3);
        
        WebElement noOfRoom = driver.findElement(By.id("room_nos"));
        noOfRoom.sendKeys(string4);
        
        WebElement checkInDate = driver.findElement(By.id("datepick_in"));
        checkInDate.sendKeys(string5);
        
        WebElement checkOutDate = driver.findElement(By.id("datepick_out"));
        checkOutDate.sendKeys(string6);
        
        WebElement adultPerRoom = driver.findElement(By.id("adult_room"));
        adultPerRoom.sendKeys(string7);
        
        WebElement childPerRoom = driver.findElement(By.id("child_room"));
        childPerRoom.sendKeys(string8);
      
    }

    @When("useer should click search button")
    public void useer_should_click_search_button() {
    	
    	WebElement submit = driver.findElement(By.id("Submit"));
    	submit.click(); 
    }

    @When("user confirmation for booking details")
    public void user_confirmation_for_booking_details() {
    	
    	WebElement confirm = driver.findElement(By.id("radiobutton_0"));
        confirm.click();
        
        WebElement ok = driver.findElement(By.id("continue"));
        ok.click();
     }

     @When("user enter the {string},{string},{string},{string},{string},{string},{string},{string},")
     public void user_enter_the(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
         
    	 WebElement frstName = driver.findElement(By.id("first_name"));
    	 frstName.sendKeys(string);
    	 
    	 WebElement lastName = driver.findElement(By.id("last_name"));
    	 lastName.sendKeys(string2);
    	 
    	 WebElement billingAdd = driver.findElement(By.id("address"));
    	 billingAdd.sendKeys(string3);
    	 
    	 WebElement crdNo = driver.findElement(By.id("cc_num"));
    	 crdNo.sendKeys(string4);
    	 
    	 WebElement crdType = driver.findElement(By.id("cc_type"));
    	 crdType.sendKeys(string5);
    	 
    	 WebElement expirymonth = driver.findElement(By.id("cc_exp_month"));
    	 expirymonth.sendKeys(string6);
    	 
    	 WebElement expiryYear = driver.findElement(By.id("cc_exp_year"));
    	 expiryYear.sendKeys(string7);
    	 
    	 WebElement cvvNo = driver.findElement(By.id("cc_cvv"));
    	 cvvNo.sendKeys(string8);
    	 	 
    	 
     }

     @When("user click book now button")
     public void user_click_book_now_button() {
    	 
    	 WebElement bookNow = driver.findElement(By.id("book_now"));
    	 bookNow.click();
    	 
    
    }







}
