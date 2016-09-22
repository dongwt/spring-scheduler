package com.dongwt.scheduler.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppTestConfig.class)
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
    
    @Test
    public void springTest(){
        try {
            Thread.sleep(1000*60);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
