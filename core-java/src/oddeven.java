
//normal if
import java.util.*;
class oddeven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a value");
			int n = sc.nextInt();
			if (n%2 == 0)
			{
			    System.out.println("Number is Even "+ n);
			}
			else{
			    System.out.println("Number is odd "+ n);
			}
		}
    }
}
