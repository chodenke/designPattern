package com.codeke.pattern.impl1;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private float temperature;				// 温度
	private float humidity;					// 湿度
	
	private Subject weatherDate;			// 天气数据
	
	

	public CurrentConditionsDisplay(Subject weatherDate) {
		this.weatherDate = weatherDate;
		weatherDate.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("==============");
		System.out.println("==当前情况布告板==");
		System.out.println("== 温度：" + this.temperature + " ==");
		System.out.println("== 湿度：" + this.humidity + " ==");
		System.out.println("==============");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}
