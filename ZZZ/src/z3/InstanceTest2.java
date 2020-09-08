package z3;
import org.springframework.context.ApplicationContext;
import 
	org.springframework.context.support.ClassPathXmlApplicationContext;
public class InstanceTest2 {
	public static void main(String[] args) {
		String xmlPath = 
				"z3/beans2.xml";
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext(xmlPath);
		System.out.println(applicationContext.getBean(Bean2.class));
	}
}
