package z4;
import org.springframework.context.ApplicationContext;
import 
	org.springframework.context.support.ClassPathXmlApplicationContext;
public class ScopeTest {
	public static void main(String[] args) {
		String xmlPath = "z4/beans4.xml";
		ApplicationContext applicationContext = 
					new ClassPathXmlApplicationContext(xmlPath);
		System.out.println(applicationContext.getBean("scope_singleton"));
		System.out.println(applicationContext.getBean("scope_prototype"));
	}
}
