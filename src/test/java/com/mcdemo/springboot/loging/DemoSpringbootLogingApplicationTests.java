package com.mcdemo.springboot.loging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoSpringbootLogingApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void contextLoads() {
        logger.trace("tracing...");
        logger.debug("debugging...");
        logger.info("infoing...");
        logger.warn("warning...");
        logger.error("erroring...");
    }

}
