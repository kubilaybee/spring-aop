package com.springprojects.spring_aop.aopexample.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService1 {
    // business logic
    // data

    public int[] retrieveData(){
        return new int[]{11,22,33,44,55};
    }
}
