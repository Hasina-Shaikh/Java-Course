
import java.util.*;
public class ladder_demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      int percentage = sc.nextInt();
	      char grade;
	      if (percentage >= 0){
	            if (percentage >= 90)
	      {
	         grade = 'A';
	      }
	      else if (percentage >= 80)
	      {
	         grade = 'B';
	      }
	      else if (percentage >= 70)
	      {
	         grade = 'C';
	      }
	      else if (percentage >= 50)
	      {
	         grade = 'D';
	      }
	      else
	      {
	         grade = 'F';
	      }
	      System.out.println("Your grade is " + grade);
	   }

	}

}
