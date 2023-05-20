
//Nested if
import java.util.*;
public class positive_number {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a value");
	        int n = sc.nextInt();
	        if (n >= 0){
	        	
	            if(n%2 == 0)
	            {
	                System.out.println("Number is Even "+ n);
	            }
	            else {
	                System.out.println("Number is odd "+ n);
            	}
	        }
	}
}