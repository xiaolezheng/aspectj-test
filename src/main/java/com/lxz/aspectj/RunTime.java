package com.lxz.aspectj;

import com.jcabi.aspects.Timeable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by xiaolezheng on 16/8/13.
 */
public class RunTime {
    private static final Logger logger = LoggerFactory.getLogger(RunTime.class);
    @Timeable(limit = 1, unit = TimeUnit.SECONDS)
    public void doRun(){
        logger.info("doRun()..........");
        try{
            TimeUnit.MILLISECONDS.sleep(2010);
        }catch (Exception e){
            logger.error("",e);
        }
    }

    public static void main(String[] args){
        RunTime runTime = new RunTime();
        runTime.doRun();
    }
}

