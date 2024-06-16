package Decorator;

public class Cheese extends PizzaDecorator {

	public Cheese(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public String getDescription() {
        return pizza.getDescription() + ", cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.0;
    }

}
