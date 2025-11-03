package com.bogdan.homework;

public class BrowserConfig {
    private BrowserType browser;
    private String version;
    private boolean isHeadless;

    // Constructor cu toti parametrii
    public BrowserConfig(BrowserType browser, String version, boolean isHeadless) {
        this.browser = browser;
        this.version = version;
        this.isHeadless = isHeadless;
    }

    // Constructor cu browser si version, headless = false
    public BrowserConfig(BrowserType browser, String version) {
        this(browser, version, false);
    }

    // Constructor doar cu browser, version = "latest", headless = false
    public BrowserConfig(BrowserType browser) {
        this(browser, "latest");
    }

    // Factory method pentru Chrome default
    public static BrowserConfig createDefaultChromeConfig() {
        return new BrowserConfig(BrowserType.CHROME, "latest", true);
    }

    public void afiseazaConfig() {
        System.out.println("Browser: " + browser + ", Version: " + version + ", Headless: " + isHeadless);
    }
}
