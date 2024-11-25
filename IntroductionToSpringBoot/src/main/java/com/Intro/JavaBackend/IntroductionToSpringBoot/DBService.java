package com.Intro.JavaBackend.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class DBService {
    @Autowired

    private DB db;

//    public DBService(DB db) {
//        this.db = db;
//    }
    //ANOTHER Way of dependency injection

    String getData(){
        return db.getData();
    }
}
