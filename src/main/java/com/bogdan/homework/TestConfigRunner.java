package com.bogdan.homework;

public class TestConfigRunner {
    public static void main(String[] args) {
        System.out.println("=== Test Browser Configurations ===\n");

        // Test constructor cu toti parametrii
        BrowserConfig config1 = new BrowserConfig(BrowserType.CHROME, "120.0", true);
        System.out.print("Config 1: ");
        config1.afiseazaConfig();

        // Test constructor cu browser si version
        BrowserConfig config2 = new BrowserConfig(BrowserType.FIREFOX, "119.0");
        System.out.print("Config 2: ");
        config2.afiseazaConfig();

        // Test constructor doar cu browser
        BrowserConfig config3 = new BrowserConfig(BrowserType.EDGE);
        System.out.print("Config 3: ");
        config3.afiseazaConfig();

        // Test factory method
        BrowserConfig config4 = BrowserConfig.createDefaultChromeConfig();
        System.out.print("Config 4 (factory): ");
        config4.afiseazaConfig();
    }
}
