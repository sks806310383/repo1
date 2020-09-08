package z1;
import org.springframework.context.ApplicationContext;
import 
	org.springframework.context.support.ClassPathXmlApplicationContext;
public class InstanceTest1 {
	public static void main(String[] args) {
		String xmlPath = "z1/beans1.xml";
		ApplicationContext applicationContext = 
							new ClassPathXmlApplicationContext(xmlPath);
         System.out.println(applicationContext.getBean(Bean1.class));
	}
}
