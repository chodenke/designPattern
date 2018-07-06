package com.codeke.test;

import com.codeke.pattern.*;

/**
 * @company: 甘肃诚诚网络技术有限公司
 * @author: codeke
 * @date: 2018-07-06 17:12
 * @description
 */
public class Demo {

	public static void main(String[] args) {
		Beverage beverage1 = new Espresso();
		System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Milk(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

		// jdk中的装饰者模式，建议查看FilterInputStream
	}
}
