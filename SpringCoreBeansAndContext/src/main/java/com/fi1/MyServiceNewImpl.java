package com.fi1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("newService")
public class MyServiceNewImpl implements MyService {

    @RandomValue
    private int someVariable;

    public void sayHello() {
        System.out.println("MyServiceNewImpl");
    }

    public int getSomeVariable() {
        return someVariable;
    }
}
