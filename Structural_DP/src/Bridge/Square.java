package Bridge;

public class Square extends Shape {

	public Square(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.print("Square filled with color ");
		color.applyColor();
	}

}
