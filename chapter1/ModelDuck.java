package chapter1;

public class ModelDuck extends Duck{

	public ModelDuck() {
		flyBehavior = new FlyNoway();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}

}