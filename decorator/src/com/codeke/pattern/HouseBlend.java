package com.codeke.pattern;

/**
 * @company: 甘肃诚诚网络技术有限公司
 * @author: codeke
 * @date: 2018-07-06 16:23
 * @description
 */
public class HouseBlend extends Beverage {

	public HouseBlend() {
		setDescription("混合咖啡");
	}


	@Override
	public double cost() {
		return 0.89;
	}
}
