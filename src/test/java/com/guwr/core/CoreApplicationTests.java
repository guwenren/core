package com.guwr.core;

import com.guwr.core.config.Config;
import com.guwr.core.config.Person;
import com.guwr.core.model.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CoreApplicationTests {
    @Test
    public void contextLoads() {
         log.trace("trace");
         log.debug("debug");
         log.info("info");
         log.warn("warn");
         log.error("error");
    }

}
