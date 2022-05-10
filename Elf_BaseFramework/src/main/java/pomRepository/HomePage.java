package pomRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//a[contains(text(),'SHOP CATEGORIES')]")
private WebElement shopCategory;

public WebElement getShopCategory() {
	return shopCategory;
}

@FindBy(xpath="//a[contains(text(),'Makeup')]")
private WebElement makeup;

public WebElement getMakeup() {
	return makeup;
}
@FindBy(linkText = "Eyeliner")
private WebElement eyeliner;

public WebElement getEyeliner() {
	return eyeliner;
}






}