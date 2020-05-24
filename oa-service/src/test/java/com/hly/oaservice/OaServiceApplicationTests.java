package com.hly.oaservice;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OaServiceApplicationTests {

    @Test
    void contextLoads() {
        ProcessEngine processEngine =
                ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml")
                        .buildProcessEngine();
        System.out.println("processEngine="+processEngine);
    }

}
