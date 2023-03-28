package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TherapistSignUpPage {
	
	public TherapistSignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Login Therapist link;
	@FindBy(xpath ="//a[text()='I am a Therapist!']")
	public WebElement therapistlink;
	
	//Therapist Sign up Link;
	@FindBy(xpath="//a[text()='Sign Up']")
	public WebElement signuplink;
	
	//Enter First Name;
	@FindBy(name="therapist_firstname")
	public WebElement firstnametxtfld;
	
	//Enter Last Name;
	@FindBy(name="therapist_lastname")
	public WebElement lastnametxtfld;

	//Enter a Email;
	@FindBy(name="email")
	public WebElement emailtxtfld;
	
	//Enter a Password;
	@FindBy(id="pass1")
	public WebElement passtxtfld;
	
	//Enter Confirm Password;
	@FindBy(id="pass2")
	public WebElement cfmpasstxtfld;
	
	//click on Term & Condition Link;
	@FindBy(xpath="//strong[text()='Terms & Conditions']")
	public WebElement tclink;
	
	//Click Accept button;
	@FindBy(xpath="//button[text()='Accept']")
	public WebElement accept;
	
	//Click on Create an account;
	@FindBy(id="create_account")
	public WebElement createaccount;
	
	public void therapistlink() {
		therapistlink.click();
		signuplink.click();
	}
	
	public void therapistname(String firstname, String lastname, String email) {
		firstnametxtfld.sendKeys(firstname);
		lastnametxtfld.sendKeys(lastname);
		emailtxtfld.sendKeys(email);
	}
	
	public void therapistpassword(String password,String confirmpass) {
		passtxtfld.sendKeys(password);
		cfmpasstxtfld.sendKeys(confirmpass);
	
	}
	public void createacc() {
		tclink.click();
		accept.click();
		createaccount.click();
	}

}
