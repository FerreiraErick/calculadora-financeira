package br.com.screens.infrastructure;

import java.awt.Component;
import java.util.HashMap;
import java.util.Map;

public final class ScreenPool {
	
	private static Map<String, Component> screenMap = new HashMap<>();

	public static Component getScreen(String screenName) {
		return screenMap.get(screenName);
	}
	
	public static void setScreen(String screenName, Component screen) {
		screenMap.put(screenName, screen);
	}
	
}
