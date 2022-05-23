package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SeleniumTrainingPage;
import pomPages.SkillraryDemo;
import pomPages.SkillraryDemoApp;

public class Testcase1 extends BaseClass
{
	@Test
	public void tc1()
	{
		SkillraryDemo sd= new  SkillraryDemo(driver);
		sd.gearsbutton();
		sd.skillraryButton();
		
		SkillraryDemoApp sda=new SkillraryDemoApp(driver);
		 driverUtilities.switchTabs(driver);
		 driverUtilities.mouseHover(driver, sda.getCoursebtn());
		 sda.seleniumTrainingButton();
		 
		 SeleniumTrainingPage t= new SeleniumTrainingPage(driver);
		 driverUtilities.doubleClick(driver,t. getPlusbtn());
		 t.addtocartbutton();
		 driverUtilities.alertPopup(driver);
	}
	
	
}
