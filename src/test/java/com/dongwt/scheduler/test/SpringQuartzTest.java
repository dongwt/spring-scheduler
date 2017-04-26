package com.dongwt.scheduler.test;

import com.dongwt.scheduler.job.FailJob;
import com.dongwt.scheduler.utils.QuartzUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.TimeUnit;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath*:spring-quartz.xml"})
public class SpringQuartzTest {
    
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
