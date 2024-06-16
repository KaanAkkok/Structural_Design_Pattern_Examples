package Bridge;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape tri = new Triangle(new Red());
		tri.applyColor();
		
		Shape square = new Square(new Green());
		square.applyColor();
	}

}
