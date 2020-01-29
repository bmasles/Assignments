/**
 * 
 */

/**
 * Takes command line args, returns their addition
 * 
 * @author Burke Masles
 *
 */
public class Addition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		try {
			for (String str : args) {
				sum += Integer.valueOf(str);
			}
		} catch (NumberFormatException exc) {
			System.out.println("Please input a valid number");
			return;
		} catch (Throwable exc) {
			System.out.println("Error has occured");
		}
		System.out.println(sum);
	}

}
