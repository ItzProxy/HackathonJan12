package com.vivvo.userservice;


import lombok.Setter;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import java.util.List;
import java.util.UUID;

public class SampleClient {

    @Setter
    private String baseUri = "http://localhost:4444";


    private String SampleCreate(UUID sample){
        return sampleTarget()
                .path(sample.toString())
                .request()
                .get(String.class);
    }

    private WebTarget sampleTarget() {
        return ClientBuilder.newClient()
                .target(baseUri)
                .path("api")
                .path("v1")
                .path("sample");

    }
}
