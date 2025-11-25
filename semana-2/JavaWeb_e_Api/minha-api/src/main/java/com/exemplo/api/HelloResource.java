package com.exemplo.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "API REST funcionando com Jetty!";
    }
    
    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public String helloJson() {
        return "{\"mensagem\": \"Olá API JSON!\"}";
    }
}