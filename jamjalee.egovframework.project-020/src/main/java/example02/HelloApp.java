package example02;

public class HelloApp {

	public static void main(String[] args) {
			MessageBean bean = new MessageBeanEng();
			bean.sayHello("PSB");
			
			MessageBean bean2 = new MessageBeanKor();
			bean2.sayHello("박성복");
			
	}	// End of main()

}	// End of class 
