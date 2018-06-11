package david.springcourses.didemo;

import david.springcourses.didemo.controllers.ConstructorInjectedController;
import david.springcourses.didemo.controllers.MyController;
import david.springcourses.didemo.controllers.PropertyInjectionController;
import david.springcourses.didemo.controllers.SetterInjectecController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController mc = (MyController) ctx.getBean("myController");

		mc.hello();

		System.out.println(ctx.getBean(PropertyInjectionController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectecController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
