package googleSearchPackage.components;
import org.openqa.selenium.WebElement;

import googleSearchPackage.AutoDriver;
import googleSearchPackage.BrowserType;

public class BrowserComponent extends AutoComponent {

	private AutoDriver driv;

	public BrowserComponent(String address, BrowserType browser) {
		super(null);
		this.driv = new AutoDriver(browser);
		this.driv.goTo(address);

	}

	@Override
	public void click() {
		System.out.println("Browser component is not clickable.");
	}

	public void refresh() {
		this.driv.refresh();
	}

	public void maximize() {
		this.driv.maximize();
	}

	public void close() {
		this.driv.closeDriver();
	}

	public void goTo(String address) {
		this.driv.goTo(address);
	}

	public WebElement getElement(String xpath) {
		return this.driv.getElement(xpath);
	}

}
