package googleSearchPackage.components;

import org.openqa.selenium.By;

public class SearchResultPageComponent extends AutoComponent {

	public SearchResultPageComponent(BrowserComponent d) {
		super(d.getElement("//div[@id='center_col']"));
	}

	/**
	 * 
	 * @param x - index of wanted search result (starts from 1).
	 * @return - a GoogleSearchResultComponent representing the wanted search result.
	 */
	public GoogleSearchResultComponent getResultComponent(int x) {
		return new GoogleSearchResultComponent(
				this.elem.findElement(By.xpath("(//div[@id='center_col']//div[@class='rc'])[" + x + "]")));
	}

}
