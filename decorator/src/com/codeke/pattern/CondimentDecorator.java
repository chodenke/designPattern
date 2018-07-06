package com.codeke.pattern;

/**
 * @company: 甘肃诚诚网络技术有限公司
 * @author: codeke
 * @date: 2018-07-06 16:21
 * @description 调料装饰者基类，扩展自饮料基类
 */
public abstract class CondimentDecorator extends Beverage{
	@Override
	public abstract String getDescription();
}
