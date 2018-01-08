package com.codeke.pattern;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void dispaly() {
		System.out.println("我是模型鸭!");
	}

}
