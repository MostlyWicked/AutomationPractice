package googleSearchPackage.pages;

import googleSearchPackage.BrowserType;
import googleSearchPackage.components.*;

public class GoogleSearchPage extends AutoPage {

	private TextboxComponent searchbox;
	private boolean searchCompleted;

	public GoogleSearchPage(BrowserType browser) {
		super("http://www.google.com", browser);
		this.searchCompleted = false;
		this.searchbox = new TextboxComponent(this.browser.getElement("//div[@id='gs_lc0']/input[@id='lst-ib']"));
	}

	public void search(String text) {
		this.searchbox.enterText(text);
		this.searchbox.pressEnter();
		this.searchCompleted = true;
	}

	public String getTitle(int index) {
		if (!searchCompleted) {
			System.err.println(
					"Error: You've attempted to access search results before conducting a search. Method \"getTitle\" will return a null value. Unexpected behavior may result.");
			return null;
		}
		
		return new SearchResultPageComponent(this.browser).getResultComponent(index).getTitle();
	}
	
	public void clickResult(int index){
		new SearchResultPageComponent(this.browser).getResultComponent(index).click();
	}

}
