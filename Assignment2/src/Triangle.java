/**
 * 
 */

/**
 * @author Burke
 *
 */
public class Triangle implements Shape {
	int height, width;

	Triangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public int calculateArea() {
		return width * height / 2;
	}

	@Override
	public void display() {
		System.out.println("Triangle");
		System.out.println("Height: " + height);
		System.out.println("Width: " + width);
		System.out.println("Area: " + calculateArea());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Triangle tri = new Triangle(4, 5);
		tri.display();
	}

}
