package springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
      public static void main(String[] args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Alien A  = context.getBean(Alien.class);
		
//		Constructor Injection
//		A.code();
		
//		Setter Injection
//		System.out.println(A.getAge());
		
//      ref type
//		Aotowire
		A.code();
		
	}
}
