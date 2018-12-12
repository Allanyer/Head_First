package chapter1;

public class MallardDuack extends Duck{
	
    public MallardDuack() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}

}
