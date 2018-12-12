package chapter1;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuack();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
