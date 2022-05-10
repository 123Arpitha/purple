package shopCategory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.HomePage;

public class TC_001_Test extends Base_Class {
	@Test
	public void shopCategory() throws InterruptedException {
		ExcelUtil eu = new ExcelUtil();
		String expectedHomePageTitle = eu.readStringDataFromExcel("Sheet1", 0, 0);
		
		HomePage homePage = new HomePage(driver);
		Assert.assertEquals(driver.getCurrentUrl(),expectedHomePageTitle,"Home Page is not displayed Successfully");
		Reporter.log("Home Page is displayed successfully", true);
		Thread.sleep(2000);
		explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[contains(text(),'SHOP CATEGORIES')]")));
		Actions action = new Actions(driver);
		action.moveToElement(homePage.getShopCategory()).perform();
		Thread.sleep(2000);
		explicitWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[contains(text(),'Makeup')]")));
		action.moveToElement(homePage.getMakeup()).perform();
		Thread.sleep(2000);
		action.moveToElement(homePage.getEyeliner()).perform();
	}

}
