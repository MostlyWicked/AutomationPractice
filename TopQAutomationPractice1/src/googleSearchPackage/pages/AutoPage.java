package googleSearchPackage.pages;

import googleSearchPackage.BrowserType;
import googleSearchPackage.components.BrowserComponent;

public abstract class AutoPage {

	protected BrowserComponent browser;
	protected String address;

	protected AutoPage(String address, BrowserType browsertype) {
		this.address = address;
		this.browser = new BrowserComponent(this.address, browsertype);
	}

	public void maximize() {
		this.browser.maximize();
	}

	public void refresh() {
		this.browser.refresh();
	}

	public void close() {
		this.browser.close();
	}
}
