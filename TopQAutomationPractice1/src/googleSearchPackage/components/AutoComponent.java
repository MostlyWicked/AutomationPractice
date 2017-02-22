package googleSearchPackage.components;
import org.openqa.selenium.WebElement;

public abstract class AutoComponent {

	protected WebElement elem;

	public AutoComponent(WebElement elem) {
		this.elem = elem;
	}

	public void click() { // TODO: not rely on the element having an ID
		String elemId = elem.getAttribute("id");
		String reportId = elemId == null ? "with ID " + elemId : "without ID";

		System.out.format("About to click element %s.\n", reportId);
		this.elem.click();
		System.out.format("Clicked element %s.\n", reportId);
	}

	public String getID() {
		return elem.getAttribute("id");
	}

}
