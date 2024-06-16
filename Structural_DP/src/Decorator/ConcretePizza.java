package Decorator;

public class ConcretePizza implements Pizza {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Plain Pizza";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 10.0;
	}

}
