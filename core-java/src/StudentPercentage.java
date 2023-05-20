
import java.util.*;   
public class StudentPercentage
{  
    public static void main(String args[]) 
    {   
       
        Scanner sc = new Scanner(System.in); 
        int n;   
        System.out.println("Enter the total subjects ");
        n=sc.nextInt();
        float arr[] = new float[n]; 
        System.out.println("Enter the marks secured in each subject ");
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextFloat();
        }
        
        float total=0;
        for(int i=0;i<n;i++)
        {
            total=total+arr[i];
        }
        System.out.println("The total marks obtained is "+total);

        float percentage; 
        percentage = (total / (float)n); 
        System.out.println( "Total Percentage : " + percentage + "%");                         
    }   
}