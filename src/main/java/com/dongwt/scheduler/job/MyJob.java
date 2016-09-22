package com.dongwt.scheduler.job;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyJob {
    public void work() {  
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("date:" + format.format(new Date()));  
    }  
}
