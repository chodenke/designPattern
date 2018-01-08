package com.codeke.pattern;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("我不能叫!");
	}

}
