package com.codeke.pattern;

public abstract class Duck {
	
	FlyBehavior flyBehavior;			//飞行行为
	QuackBehavior quackBehavior;		//叫的行为
	
	/**
	 * @description 注入飞行行为
	 * @param flyBehavior
	 * @return void
	 * @throws
	 */
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	/**
	 * @description 注入叫的行为
	 * @param quackBehavior
	 * @return void
	 * @throws
	 */
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	/**
	 * @description 
	 * @return void
	 * @throws
	 */
	public abstract void dispaly();
	
	/**
	 * @description 飞的方法
	 * @return void
	 * @throws
	 */
	public void performFly(){
		flyBehavior.fly();
	}
	
	/**
	 * @description 叫的方法
	 * @return void
	 * @throws
	 */
	public void performQuack(){
		quackBehavior.quack();
	}

}
