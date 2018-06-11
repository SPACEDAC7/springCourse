package david.springcourses.didemo.controllers;

import david.springcourses.didemo.services.GreetingService;

public class PropertyInjectionController {

    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreetings();
    }
}
