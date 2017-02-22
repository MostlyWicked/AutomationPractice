package googleSearchPackage;

public enum BrowserType {
	FIREFOX("Firefox"), CHROME("Chrome"), SAFARI("Safari"), IE("Internet Explorer"), EDGE("Edge"), OPERA(
			"Opera"), ERRORTEST("ERRORTEST");

	private String repr;

	private BrowserType(String btype) {
		this.repr = btype;
	}

	@Override
	public String toString() {
		return this.repr;
	}
}
