/**
 * 
 */

/**
 * Implement example
 * 
 * @author Burke Masles
 *
 */
public class Rectangle implements Shape {
	int height, width;

	Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public int calculateArea() {
		return width * height;
	}

	@Override
	public void display() {
		System.out.println("Rectangle");
		System.out.println("Height: " + height);
		System.out.println("Width: " + width);
		System.out.println("Area: " + calculateArea());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(4, 5);
		rect.display();
	}

}
