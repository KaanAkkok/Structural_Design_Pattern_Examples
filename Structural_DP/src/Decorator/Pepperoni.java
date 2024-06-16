package Decorator;

public class Pepperoni extends PizzaDecorator {

	public Pepperoni(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public String getDescription() {
        return pizza.getDescription() + ", pepperoni";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 3.0;
    }

}
