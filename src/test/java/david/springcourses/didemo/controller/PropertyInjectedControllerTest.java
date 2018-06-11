package david.springcourses.didemo.controller;

import david.springcourses.didemo.controllers.PropertyInjectionController;
import david.springcourses.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {
    private PropertyInjectionController propertyInjectionController;

    @Before
    public void setUp() throws Exception{
        this.propertyInjectionController = new PropertyInjectionController();
        this.propertyInjectionController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreetings() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_DUDES, propertyInjectionController.sayHello());
    }
}
