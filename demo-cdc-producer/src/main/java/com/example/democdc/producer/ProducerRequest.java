package com.example.democdc.producer;

public class ProducerRequest {
    private String id;

    public ProducerRequest() {
        super();
    }

    public ProducerRequest(String id) {
        super();
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
