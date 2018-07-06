package com.codeke.pattern;

/**
 * @company: 甘肃诚诚网络技术有限公司
 * @author: codeke
 * @date: 2018-07-06 16:23
 * @description
 */
public class Espresso extends Beverage {

	public Espresso() {
		setDescription("浓缩咖啡");
	}


	@Override
	public double cost() {
		return 1.99;
	}
}
