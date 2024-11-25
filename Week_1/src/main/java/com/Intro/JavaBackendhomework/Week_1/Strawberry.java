package com.Intro.JavaBackendhomework.Week_1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "TYPE_ENV",havingValue = "strawberry")

public class Strawberry implements Frosting, Syrup{

    public String getFrosting(){
        return " its a Strawberry Frosting";
    }

    @Override
    public String getSyrup() {
        return "Strawberry syrup";
    }
}
