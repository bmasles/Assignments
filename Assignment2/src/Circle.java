/**
 * 
 */

/**
 * @author Burke Masles
 *
 */
public class Circle implements Shape {
	int diameter;

	Circle(int diameter) {
		this.diameter = diameter;
	}

	@Override
	public int calculateArea() {
		return (int) (diameter * Math.PI);
	}

	@Override
	public void display() {
		System.out.println("Triangle");
		System.out.println("Diameter: " + diameter);
		System.out.println("Area: " + calculateArea());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle cir= new Circle(10);
		cir.display();
	}

}
