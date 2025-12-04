package com.exemplo.api;

import java.util.Set;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/")
public class MyApplication extends Application {
    
    @Override
    public Set<Class<?>> getClasses() {
        return Set.of(HelloResource.class); // Classes de recursos REST
    }
}