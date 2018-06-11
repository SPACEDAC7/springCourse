package david.springcourses.didemo.controllers;

import david.springcourses.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PropertyInjectionController {

    @Autowired
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreetings();
    }
}
