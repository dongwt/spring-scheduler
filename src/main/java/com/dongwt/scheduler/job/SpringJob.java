package com.dongwt.scheduler.job;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component  
public class SpringJob {
    @Scheduled(cron="*/1 * * * * ?")    
    public void task(){   
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("spring date:" + format.format(new Date()));  
    }       
}
