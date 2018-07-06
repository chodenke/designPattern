package com.codeke.pattern;

/**
 * @company: 甘肃诚诚网络技术有限公司
 * @author: codeke
 * @date: 2018-07-06 16:18
 * @description 饮料基类
 */
public abstract class Beverage {

	private String description = "未知饮料";

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription(){
		return this.description;
	}

	/**
	 * 计算并返回饮料费用的方法
	 * @return
	 */
	public abstract double cost();

}

