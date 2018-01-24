package br.com.lima.didemo.controllers;

import br.com.lima.didemo.services.GreetingService;
import br.com.lima.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingServiceImpl ;

    public String sayHello(){
        return greetingServiceImpl .sayGreeting();
    }

}