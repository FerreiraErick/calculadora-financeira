package br.com.screens.infrastructure;

import java.util.HashMap;
import java.util.Map;

public final class ScreenPool {
	
	private static Map<String, Object> screenMap = new HashMap<>();

	public static Object getScreen(String screenName) {
		return screenMap.get(screenName);
	}
	
	public static void setScreen(String screenName,Object screen) {
		screenMap.put(screenName, screen);
	}
	
	
}
