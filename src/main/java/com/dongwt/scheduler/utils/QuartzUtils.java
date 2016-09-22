package com.dongwt.scheduler.utils;

import java.util.Date;

import org.quartz.DateBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.SimpleTriggerImpl;

import com.dongwt.scheduler.job.BaseJob;

public class QuartzUtils {
    
    
    public static void baseTest() throws Exception{
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        
        JobDetail jobDetail = JobBuilder.newJob(BaseJob.class).withIdentity("job1", "group1").build();
        
        Date runTime = DateBuilder.evenSecondDate( new Date()); 
        
        Trigger trigger  = new SimpleTriggerImpl("trigger1", "group1", 60, 1000);
        scheduler.scheduleJob(jobDetail, trigger);
        scheduler.start();
        
        Thread.sleep(1000*60);
        
        scheduler.shutdown(true);
    }

}
