package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".title")
	private WebElement pageTitle;

	@FindBy(css = "#add-to-cart-sauce-labs-backpack")
	private WebElement Backpack;

	@FindBy(css = "#shopping_cart_container")
	private WebElement cartIcon;

	@FindBy(css = ".shopping_cart_badge")
	private WebElement no_of_items_in_cart;

	public String VerifyPageTitle() {
		return pageTitle.getText();
	}

	public void addBackpack() {
		Backpack.click();
	}

	public void ShoppingCartIcon() {
		cartIcon.click();
	}

	public int VerifyItemQuantity() {
		try {
			return Integer.parseInt(no_of_items_in_cart.getText());
		} catch (Exception e) {
			return 0; // if badge not visible, no items
		}

	}
}