package com.fi1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppRunner {

    private MyService myService;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        AppRunner appRunner = applicationContext.getBean(AppRunner.class);
        appRunner.start(args);
    }

    private void start(String[] args) {
        myService.sayHello();
    }

    @Autowired
    @Qualifier("newService")
    public void setMyService(MyService myService) {
        this.myService = myService;
    }
}
