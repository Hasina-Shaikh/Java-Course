import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee {

	public static void main(String[] args) {
		
		ApplicationContext  context = new ClassPathXmlApplicationContex("bean.xml");
		Employee employee = (Employee) context.getBeans("employeeBean");
		System.out.println("" + employee.getEmpName());
		System.out.println(""+employee.getEmpID());	
	}
}



