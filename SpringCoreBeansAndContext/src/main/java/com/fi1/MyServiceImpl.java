package com.fi1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("oldService")
public class MyServiceImpl implements MyService {
    public void sayHello() {
        System.out.println("MyServiceImpl");
    }
}
