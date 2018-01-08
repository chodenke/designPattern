package com.codeke.pattern;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void dispaly() {
		System.out.println("我是绿头鸭!");
	}

}
