


public class OperatorDemo {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		//if (a == b)
	    //if (a != b)
		if(a<b){
        System.out.println("a and b is same");
		}
		else {
		System.out.println("a and b is not equal");
		}
		
		System.out.println(++a);
		System.out.println(--b);
		
		int d = ~a;
		System.out.println(d);
		
		if((a<b)||(a>b)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		int age = 10;
		boolean b1 = age>=18? true:false;
		System.out.println(b1);

	}

}
