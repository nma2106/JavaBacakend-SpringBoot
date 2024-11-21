package com.Intro.JavaBackend.IntroductionToSpringBoot;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//THIS Annotation will make this a bean

public class Apple {

    void eatApple(){
        System.out.println("I am eating the apple");
    }
}
