package Decorator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza pizza = new ConcretePizza();
		
		pizza = new Cheese(pizza);
		pizza = new Pepperoni(pizza);
		
		System.out.println("Description: " + pizza.getDescription());
        System.out.println("Cost: $" + pizza.getCost());
	}

}
