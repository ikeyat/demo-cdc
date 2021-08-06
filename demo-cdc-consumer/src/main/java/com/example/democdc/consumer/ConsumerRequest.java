package com.example.democdc.consumer;

public class ConsumerRequest {
    private String id;

    public ConsumerRequest() {
        super();
    }

    public ConsumerRequest(String id) {
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
