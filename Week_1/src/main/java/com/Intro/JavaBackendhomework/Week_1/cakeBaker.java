package com.Intro.JavaBackendhomework.Week_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class cakeBaker {

    @Autowired
    Frosting frosting;

    @Autowired
    Syrup syrup;

    String Cakebake(){
        //System.out.println("Order is being prepared");
        return "Order is being prepared";
    }

    String getSyrup(){
        return syrup.getSyrup();
    }

    String getFrosting(){
        return frosting.getFrosting();
    }


}
