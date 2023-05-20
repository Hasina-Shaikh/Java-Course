
//Overloading
public class MethodOverridding {

	private static void display(int a){
        System.out.println("Arguments: " + a);
    }

    private static void display(int a, int b){
        System.out.println("Arguments: " + a + " and " + b);
    }
    
    private static void display1(int c){
        System.out.println("Got Integer data.");
    }

    // this method  accepts String object
    private static void display1(String a1){
        System.out.println("Got String object.");
    }

	
	
	public static void main(String[] args) {
		display(10);
		display(10,20);
		display1(30);
		display1("Muskan");
		
   
	}

}


