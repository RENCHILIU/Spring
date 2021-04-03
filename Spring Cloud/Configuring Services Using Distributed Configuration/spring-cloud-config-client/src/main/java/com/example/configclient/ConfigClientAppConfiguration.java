package com.example.configclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/*
* e.g:
* some.property=profile specific value
* some.other.property=profile specific value
* */
@Component
@ConfigurationProperties(prefix="some") //TODO: all the value start with "some"
public class ConfigClientAppConfiguration {
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    private String property;


}
