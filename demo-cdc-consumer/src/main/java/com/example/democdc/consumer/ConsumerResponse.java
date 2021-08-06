package com.example.democdc.consumer;

public class ConsumerResponse {
    private String id;
    private String firstName;
    private String lastName;


    public ConsumerResponse() {
        super();
    }

    public ConsumerResponse(String id, String lastName, String firstName) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
