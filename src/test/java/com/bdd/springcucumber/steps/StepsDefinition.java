package com.bdd.springcucumber.steps;

import com.bdd.springcucumber.FoRESTTestApplication;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

@ContextConfiguration(
        classes = FoRESTTestApplication.class,
        loader = SpringBootContextLoader.class)
@WebAppConfiguration
public class StepsDefinition {

}
