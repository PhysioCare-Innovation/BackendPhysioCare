package com.physiocare.backend.test.cucumber;


import com.physiocare.backend.BackendPhysioCareApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
@CucumberContextConfiguration
@SpringBootTest(classes = BackendPhysioCareApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = BackendPhysioCareApplication.class,
        loader = SpringBootContextLoader.class)
public class CucumberSpringConfiguration {
}
