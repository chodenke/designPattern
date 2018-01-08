package com.codeke.pattern;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	@Override
	public void dispaly() {
		System.out.println("我是橡皮鸭!");
	}

}
