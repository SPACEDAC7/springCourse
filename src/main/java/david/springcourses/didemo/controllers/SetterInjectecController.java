package david.springcourses.didemo.controllers;

import david.springcourses.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectecController {


    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreetings();
    }

    @Autowired
    @Qualifier("setterGreetingService")
    public void setGreetingService( GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
