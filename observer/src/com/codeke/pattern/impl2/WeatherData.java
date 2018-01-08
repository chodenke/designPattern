package com.codeke.pattern.impl2;

import java.util.Observable;

public class WeatherData extends Observable {
	
	
	private float temperature;				// 温度
	private float humidity;					// 湿度
	private float pressure;					// 压力
	
	/**
	 * @description 测量变更
	 * @return void
	 * @throws
	 */
	private void measurementsChanged(){
		setChanged();
		notifyObservers();
	}

	/**
	 * @description 设置测量值的方法
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 * @return void
	 * @throws
	 */
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
