package com.Intro.JavaBackend.IntroductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@ConditionalOnProperty(name = "DEPLOY_ENV", havingValue = "Production")
public class ProdDB implements DB{

    public String getData(){
        return "ProdData";
    }
}
