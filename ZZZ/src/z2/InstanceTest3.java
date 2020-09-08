package z2;
import org.springframework.context.ApplicationContext;
import 
	org.springframework.context.support.ClassPathXmlApplicationContext;
public class InstanceTest3 {
	public static void main(String[] args) {
		String xmlPath = "z2/beans3.xml";
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext(xmlPath);
		System.out.println(applicationContext.getBean(Bean3.class));
	}
} 
