package com.codeke.pattern;

/**
 * @company: 甘肃诚诚网络技术有限公司
 * @author: codeke
 * @date: 2018-07-06 16:57
 * @description
 */
public class Mocha extends CondimentDecorator {

	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 摩卡";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.2;
	}
}
