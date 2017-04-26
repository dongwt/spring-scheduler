package com.dongwt.scheduler.test;

import com.dongwt.scheduler.job.FailJob;
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
    public void test(){
        try {
            Thread.sleep(1000*60);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
