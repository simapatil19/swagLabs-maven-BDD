package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage {
	private WebDriver driver;

	@FindBy(css = "#finish")
	private WebElement finishButton;

	@FindBy(css = ".complete-header")
	private WebElement successMsg;

	public CheckoutOverviewPage(WebDriver driver) {
		this.driver = driver;
	}

	// actions
	public void ClickonFinish() {
		finishButton.click();
	}

	public String Successmsg() {
		return successMsg.getText();
	}
}
