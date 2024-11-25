package com.Intro.JavaBackend.IntroductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
@Component
@ConditionalOnProperty(name = "DEPLOY_ENV", havingValue = "Development")

public class DevDB implements DB {

    public String getData(){
        return "DevData";
    }
}
