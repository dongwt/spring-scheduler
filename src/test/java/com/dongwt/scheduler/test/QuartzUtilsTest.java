package com.dongwt.scheduler.test;

import org.junit.Test;

import com.dongwt.scheduler.utils.QuartzUtils;


public class QuartzUtilsTest {

    @Test
    public void baseTest(){
        try {
            QuartzUtils.baseTest();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
