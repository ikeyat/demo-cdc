package com.example.democdc.producer;

public class ProducerResponse {
    private String id;
    private String firstName;
    private String lastName;

    public ProducerResponse() {
        super();
    }

    public ProducerResponse(String id,  String lastName, String firstName) {
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
