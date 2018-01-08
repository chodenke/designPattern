package com.codeke.pattern;

public class RedHeadDuck extends Duck{
	
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void dispaly() {
		System.out.println("我是红头鸭!");
	}

}
