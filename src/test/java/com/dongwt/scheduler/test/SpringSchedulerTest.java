package com.dongwt.scheduler.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description:
 * @author: dongwt
 * @create: 2017-04-26 20:41
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath*:spring-scheduler.xml"})
public class SpringSchedulerTest {

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
