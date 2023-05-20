

//If-else
import java.util.*;
public class min_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number");
        int n = sc.nextInt();
        System.out.println("Enter a second value");
        int n1 = sc.nextInt();
        if (n > n1)
        {
            System.out.println(n + " Number is greater than "+ n1);
        }
        else{
            System.out.println(n1 + " Number is less than "+ n);
        }
	}

}
