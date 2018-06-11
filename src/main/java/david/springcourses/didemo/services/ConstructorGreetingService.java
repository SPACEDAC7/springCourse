package david.springcourses.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hi - I was injected by contructor";
    }
}
