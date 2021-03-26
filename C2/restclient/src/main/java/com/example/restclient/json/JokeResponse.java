package com.example.restclient.json;

import com.fasterxml.jackson.annotation.JsonProperty;

//TODO: JSON response mapping
public class JokeResponse {

    private String status;

    //TODO: if the name is not matched with api ,
    // you can change in application.properties by change jackson naming

    // TODO: hardcode , you can use @JsonProperty("anotherValue") to change to another name
    private Value value;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
