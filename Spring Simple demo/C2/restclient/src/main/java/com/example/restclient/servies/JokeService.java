package com.example.restclient.servies;

import com.example.restclient.json.JokeResponse;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//TODO: Spring boot doc 4.15. Calling REST Services with RestTemplate

//TODO: this is a service you use to call another api/Service
@Service
public class JokeService {
    private static final String BASE = "http://api.icndb.com/jokes/random?limitTo=[nerdy]";
    private RestTemplate restTemplate;

    //TODO: RestTemplateBuilder is autowired
    public JokeService(RestTemplateBuilder builder) {
        restTemplate = builder.build();
    }


    public String getJoke(String first, String last) { //TODO: right click to generate Junit5 test func
        String url = String.format("%s&firstName=%s&lastName=%s", BASE, first, last);
        JokeResponse response = restTemplate.getForObject(url, JokeResponse.class);
        String output = "";
        if (response != null) {  //TODO: response.nn
            output = response.getValue().getJoke();
        }
        return output;
    }
}
