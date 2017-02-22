package googleSearchPackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AutoDriver {

	/**
	 * This class is intended as a wrapper to WebDriver. Constructor expects one
	 * of the BrowserType enum types.
	 */

	private BrowserType browsertype;
	private WebDriver driv;

	public AutoDriver(BrowserType browser) {
		this.browsertype = browser;
		System.out.format("Trying to open browser (%s).\n", browser);
		switch (browser) {
		case FIREFOX:
			this.driv = new FirefoxDriver();
			break;
		case IE:
			this.driv = new InternetExplorerDriver();
			break;
		case EDGE:
			this.driv = new EdgeDriver();
			break;
		case CHROME:
			this.driv = new ChromeDriver();
			break;
		case SAFARI:
			this.driv = new SafariDriver();
			break;
		case OPERA:
			this.driv = new OperaDriver();
			break;
		default:
			// TODO: Ideally should throw exception here, low priority.
			System.err.println("Error: unfamiliar BrowserType used in AutoDriver constructor.");
			System.exit(-1);
		}
		System.out.println("Successfully opened browser.");
		this.driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // TODO:
																			// explicit
																			// wait

	}

	public void goTo(String address) {
		System.out.format("About to navigate to address \"%s\".\n", address);

		this.driv.navigate().to(address);

		System.out.println("Navigated successfully.");
		System.out.format("Address is now \"%s\".\n", driv.getCurrentUrl());
	}
	
	public WebElement getElement(String xpath){
		return this.driv.findElement(By.xpath(xpath));
	}

	public String getBrowserType() {
		return this.browsertype.toString();
	}

	public void closeDriver() {
		System.out.println("Closing browser...");
		this.driv.close();
	}

	public void maximize() {
		System.out.println("About to maximize window.");
		this.driv.manage().window().maximize();
		System.out.println("Window should now be maximized.");
		// TODO: Check if window is actually maximize and report, low priority.
	}

	public void refresh() {
		System.out.println("About to refresh window.");
		this.driv.navigate().to(this.driv.getCurrentUrl());
		System.out.println("Window should now be refreshed.");
	}

}
