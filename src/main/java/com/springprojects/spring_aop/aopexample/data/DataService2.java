package com.springprojects.spring_aop.aopexample.data;

import com.springprojects.spring_aop.aopexample.annotations.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class DataService2 {
    // business logic
    // data

    @TrackTime
    public int[] retrieveData(){
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new int[]{111,222,333,444,555};
    }
}
