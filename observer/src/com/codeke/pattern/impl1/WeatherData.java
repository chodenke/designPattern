package com.codeke.pattern.impl1;

import java.util.ArrayList;


public class WeatherData implements Subject {
	
	private ArrayList<Observer> observers;	// 观察者s
	
	private float temperature;				// 温度
	private float humidity;					// 湿度
	private float pressure;					// 压力
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	/**
	 * @description 注册观察者
	 * @see com.codeke.pattern.impl1.Subject#registerObserver(com.codeke.pattern.impl1.Observer)
	 * @param o
	 * @throws
	 */
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	/**
	 * @description 移除观察者
	 * @see com.codeke.pattern.impl1.Subject#removeObserver(com.codeke.pattern.impl1.Observer)
	 * @param o
	 * @throws
	 */
	@Override
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if(index >= 0){
			observers.remove(index);
		}
	}

	/**
	 * @description 通知观察者
	 * @see com.codeke.pattern.impl1.Subject#notifyObservers()
	 * @throws
	 */
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	/**
	 * @description 测量变更
	 * @return void
	 * @throws
	 */
	private void measurementsChanged(){
		notifyObservers();
	}

	/**
	 * @description 设置测量值的fang'fa
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
	
	

}
