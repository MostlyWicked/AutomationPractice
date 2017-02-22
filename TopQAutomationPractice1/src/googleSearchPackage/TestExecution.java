package googleSearchPackage;

import googleSearchPackage.pages.GoogleSearchPage;

public class TestExecution {

	public static void main(String[] args) {
		
		// modify paths as required
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Dima\\eclipse\\Selenium\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dima\\eclipse\\Selenium\\chromedriver_win32\\chromedriver.exe");

		GoogleSearchPage g = new GoogleSearchPage(BrowserType.FIREFOX);
		g.maximize();
		g.search("test");
		g.clickResult(3);
		g.close();
	}

}
