package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TherapistLoginPage {
	
	public TherapistLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//Therapist SignIn Link;
	@FindBy(xpath="//a[text()='Sign In']")
	public WebElement SignInLink;
	
	//Enter therapist Mail;
	@FindBy(id="email")
	public WebElement themail;
	
	//Click to continue button;
	@FindBy(id="continue")
	public WebElement cont;
	
	//Enter the therapist password;
	@FindBy(id="pass")
	public WebElement pass;
	
	//Click to Sign in button;
	@FindBy(id="sign_in")
	public WebElement signinbutton;
	
	
}
