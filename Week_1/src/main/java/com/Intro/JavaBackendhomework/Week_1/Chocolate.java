package com.Intro.JavaBackendhomework.Week_1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "TYPE_ENV",havingValue = "chocolate")

public class Chocolate implements Frosting, Syrup{

    public String getFrosting(){
        return "Its a chocolate frosting";
    }

    @Override
    public String getSyrup() {
        return "Chocolate Syrup";
    }
}
