package TestScripts;

import org.testng.annotations.Test;

import POM.TherapistSignUpPage;
import masys.utilities.BaseClass;

public class TC_Therapist_Signup extends BaseClass{
	
	@Test
	public void signup() throws InterruptedException {
		TherapistSignUpPage therapist=new TherapistSignUpPage(driver);
		therapist.therapistlink();
		therapist.therapistname("John", "Doe", "mayank@masys.tech");
		therapist.therapistpassword("masys#A546", "masys#A546");
		therapist.createacc();
		
	}

}
