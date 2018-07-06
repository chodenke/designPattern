package com.codeke.pattern;

/**
 * @company: 甘肃诚诚网络技术有限公司
 * @author: codeke
 * @date: 2018-07-06 17:10
 * @description
 */
public class Soy extends CondimentDecorator {

	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 豆浆";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.15;
	}
}
