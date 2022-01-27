package com.example.restclient.servies;

import org.apache.juli.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class JokeServiceTest {

    //TODO: the way how you have the Log, it is not autowired.
    private Logger logger = LoggerFactory.getLogger(JokeServiceTest.class);

    @Autowired
    private JokeService servie;

    @Test
    void getJoke() {
        String joke = servie.getJoke("renchi", "liu");
        logger.info(joke);
        assertTrue(joke.contains("renchi") || joke.contains("liu"));
    }
}