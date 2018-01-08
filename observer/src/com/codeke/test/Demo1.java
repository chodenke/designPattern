package com.codeke.test;

import com.codeke.pattern.impl1.CurrentConditionsDisplay;
import com.codeke.pattern.impl1.WeatherData;


public class Demo1 {

	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		
		// 这里做简单的测试，只实现了一个布告板
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(36.5f, 41.2f, 30.4f);
		System.out.println("-------------------分割线------------------------");
		weatherData.setMeasurements(37.8f, 38.7f, 41.5f);
		System.out.println("-------------------分割线------------------------");
		weatherData.setMeasurements(31.2f, 50.1f, 33.8f);
	}

}
