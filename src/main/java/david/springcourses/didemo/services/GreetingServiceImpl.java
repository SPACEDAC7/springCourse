package david.springcourses.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_DUDES = "Hello guays";


    @Override
    public String sayGreetings() {
        return HELLO_DUDES;
    }
}
