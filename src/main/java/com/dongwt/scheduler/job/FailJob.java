package com.dongwt.scheduler.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class FailJob implements Job {
    private static final int DEFAULT_RETRY_TIME = 3;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        Integer result = (Integer) context.get("result");
        if (result == null || result < DEFAULT_RETRY_TIME) {
            JobExecutionException j = new JobExecutionException();
            context.put("result", result == null ? 2 : result + 1);
            j.setRefireImmediately(true);
            if(null == result){
                result = 1;
            }else{
                result++;
            }
            context.put("result", result);
            System.out.println("失败了。。。" + result);
            throw j;
        }else{
            System.out.println("执行成功...");
        }
       
    }
}
