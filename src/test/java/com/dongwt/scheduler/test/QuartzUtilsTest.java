package com.dongwt.scheduler.test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import com.dongwt.scheduler.job.FailJob;
import com.dongwt.scheduler.utils.QuartzUtils;

public class QuartzUtilsTest {

    @Test
    public void baseTest() {
        try {
            QuartzUtils.baseTest();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFailJob() throws SchedulerException, InterruptedException {
        SchedulerFactory sf = new StdSchedulerFactory();
        Scheduler sc = sf.getScheduler();
        JobDetail job1 = JobBuilder.newJob(FailJob.class).withIdentity("job1", "group1").build();
        Trigger trigger1 = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1").startNow().build();
        sc.scheduleJob(job1, trigger1);
        sc.start();
        TimeUnit.DAYS.sleep(1);
    }

}
