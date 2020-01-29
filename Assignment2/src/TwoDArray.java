/**
 * 
 */

/**
 * Takes a 2D array and finds max
 * 
 * @author Burke Masles
 *
 */
public class TwoDArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] arr = { { 2, 6, 2, 1, 9 }, { 50, 23, 7, 45, 0 }, { 33, -9, 4, 7, 17 }, { 100, 3, 77, 9, 23 },
				{ 68, 2, 55, 34, 6 } };
		int max = Integer.MIN_VALUE;
		int maxPos[] = new int[2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					maxPos[0] = i;
					maxPos[1] = j;
				}
			}
		}
		System.out.println("Max Value: " + max);
		System.out.println("Max Position: " + maxPos[0] + " " + maxPos[1]);
	}

}
