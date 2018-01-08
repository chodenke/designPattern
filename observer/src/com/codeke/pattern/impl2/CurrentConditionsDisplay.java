package com.codeke.pattern.impl2;

import java.util.Observable;
import java.util.Observer;


public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private Observable observable;
	private float temperature;				// 温度
	private float humidity;					// 湿度
	
	/**
	 * @description 构造方法，注入主题
	 * <p>TODO</p>
	 * @param observable
	 */
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		// 向主题中添加观察者
		observable.addObserver(this);
	}

	/**
	 * @description 布告板发布布告的方法
	 * @see com.codeke.pattern.impl2.DisplayElement#display()
	 * @throws
	 */
	@Override
	public void display() {
		System.out.println("==============");
		System.out.println("==当前情况布告板==");
		System.out.println("== 温度：" + this.temperature + " ==");
		System.out.println("== 湿度：" + this.humidity + " ==");
		System.out.println("==============");
	}


	/**
	 * @description 当主题发生变化时通知观察者的方法
	 * @see Observer#update(Observable, Object)
	 * @param o
	 * @param arg
	 * @throws
	 */
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

}
