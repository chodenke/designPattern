package com.codeke.pattern;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("我在呱呱叫!");
	}

}
