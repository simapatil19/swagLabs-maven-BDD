package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	private WebElement UsernameFiled;

	@FindBy(id = "password")
	private WebElement PasswordFiled;

	@FindBy(id = "login-button")
	private WebElement LoginButton;

	@FindBy(xpath = "//div[@class='error-message-container error']")
	private WebElement ErrorMessge;

	public void login(String Username, String password) {
		UsernameFiled.sendKeys(Username);
		PasswordFiled.sendKeys(password);
		LoginButton.click();
	}

	public void enterUsername(String uname) {
		UsernameFiled.sendKeys(uname);
	}

	public String getErrorMSG() {
		return ErrorMessge.getText();
	}

	public void EnterPaaword(String password) {
		PasswordFiled.sendKeys(password);
	}

}
