package z2;
public class MyBean3Factory {
	public MyBean3Factory() {
		System.out.println("bean3工厂");
	}
	public Bean3 createBean(){
		return new Bean3();
	}
}
