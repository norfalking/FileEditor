package main;

import gui.Window;

public class Application {
	
	// fields
	private static final String title = "File Editor";
	private static final String version = "1.0.0";

	
	
	// getters
	public static String getTitle() {
		return title;
	}

	public static String getVersion() {
		return version;
	}
	
	
	
	// methods
	public static void main(String[] args) {
		
		Window window = new Window();

	}

}
