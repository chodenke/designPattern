package com.codeke.test;

import com.codeke.pattern.FlyRocketPowered;
import com.codeke.pattern.MallardDuck;
import com.codeke.pattern.ModelDuck;
import com.codeke.pattern.RedHeadDuck;
import com.codeke.pattern.RubberDuck;

public class Demo {

	public static void main(String[] args) {
		
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.dispaly();
		mallardDuck.performQuack();
		mallardDuck.performFly();
		
		System.out.println("========================================");
		
		RedHeadDuck redHeadDuck = new RedHeadDuck();
		redHeadDuck.dispaly();
		redHeadDuck.performQuack();
		redHeadDuck.performFly();

		System.out.println("========================================");
		
		RubberDuck rubberDuck = new RubberDuck();
		rubberDuck.dispaly();
		rubberDuck.performQuack();
		rubberDuck.performFly();

		System.out.println("========================================");
		
		ModelDuck modelDuck = new ModelDuck();
		modelDuck.dispaly();
		modelDuck.performQuack();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
		

	}

}
