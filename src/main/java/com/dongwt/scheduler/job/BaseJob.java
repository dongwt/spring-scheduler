package com.dongwt.scheduler.job;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class BaseJob implements Job{

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("date:" + format.format(new Date()));      
    }
}
