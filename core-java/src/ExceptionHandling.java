
import java.sql.SQLException;
import java.util.Scanner;

public class ExceptionHandling {

	public int devide(int a) {
		int b = 0;
		try {
			b = a / 0;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return b;
	}

	public int devideMethod1(int a) throws Exception {
		int b = 0;
		b = a / 0;
		return b;
	}

	public static void main(String[] args) {

		ExceptionHandling eh = new ExceptionHandling();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check the devide by zero  ");
		int number = sc.nextInt();
		try {
			System.out.println("Divide " + eh.devideMethod1(number));
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally Executed");
		}
//		System.out.println("Divide " + eh.devide(number));
	}

}
