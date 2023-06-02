package com.bluethink.mn;

import io.micronaut.context.annotation.Primary;
import jakarta.inject.Singleton;
@Primary
@Singleton
public class HelloWorldService implements Myservice {
    public String hellobluethink(){
        return "Hello from Service!";
    }
}
