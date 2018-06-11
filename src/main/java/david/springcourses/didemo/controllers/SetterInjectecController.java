package david.springcourses.didemo.controllers;

import david.springcourses.didemo.services.GreetingService;

public class SetterInjectecController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreetings();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
