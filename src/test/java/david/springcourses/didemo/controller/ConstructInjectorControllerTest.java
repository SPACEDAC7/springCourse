package david.springcourses.didemo.controller;

import david.springcourses.didemo.controllers.ConstructorInjectedController;
import david.springcourses.didemo.controllers.SetterInjectecController;
import david.springcourses.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructInjectorControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception{
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreetings() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_DUDES, constructorInjectedController.sayHello());
    }
}
