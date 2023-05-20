/**
 * 
 */


/**
 * @author lenovo
 *
 */
public class PrintNumbers {


	public void printNumber(int x) {
		System.out.println(x);
	}

	public static void main(String[] args) {

		int a, b, c, d;

		PrintNumbers numbers = new PrintNumbers();
		for (int i = 1; i <= 10; i++) {
			numbers.printNumber(i);
		}

	}

}
