

public class ConstructorDemo {
	int id;
	String name;

	
/*	ConstructorDemo(){
		super();
		id = 1;
		name= "Muskan";
	}
*/

	ConstructorDemo(int id,String name){
		super();
		this.id = id;
		this.name=name;
		
		
	}
	public static void main(String[] args) {
	
		ConstructorDemo cd = new ConstructorDemo(2,"Arsh");
		System.out.println(cd.id);
		System.out.println(cd.name);

	}

}
