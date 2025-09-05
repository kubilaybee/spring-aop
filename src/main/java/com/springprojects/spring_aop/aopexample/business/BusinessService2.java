package com.springprojects.spring_aop.aopexample.business;

import com.springprojects.spring_aop.aopexample.data.DataService1;
import com.springprojects.spring_aop.aopexample.data.DataService2;
import java.util.Arrays;
import org.springframework.stereotype.Service;

@Service
public class BusinessService2 {
    private DataService2 dataService2;

    public BusinessService2(DataService2 dataService2) {
        this.dataService2 = dataService2;
    }

    public int calculateMax(){
        int[] data = dataService2.retrieveData();
        try {
            Thread.sleep(11);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        throw new RuntimeException("Something Went Wrong !!");
        return Arrays.stream(data).max().orElse(0);
    }
}
