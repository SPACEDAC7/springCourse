package david.springcourses.didemo.controller;

import david.springcourses.didemo.controllers.PropertyInjectionController;
import david.springcourses.didemo.controllers.SetterInjectecController;
import david.springcourses.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectionControllerTest {

    private SetterInjectecController setterInjectecController;

    @Before
    public void setUp() throws Exception{
        this.setterInjectecController = new SetterInjectecController();
        this.setterInjectecController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreetings() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_DUDES, setterInjectecController.sayHello());
    }
}
