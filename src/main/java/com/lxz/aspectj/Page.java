package com.lxz.aspectj;

import com.jcabi.aspects.Cacheable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by xiaolezheng on 16/8/13.
 */
public class Page {
    private static final Logger logger = LoggerFactory.getLogger(Page.class);

    @Cacheable
    public String get(){
        logger.info("run get()............");
        return "hello world";
    }

    public String getValue(){
        return get();
    }


    public static void main(String[] args){
        Page page = new Page();
        for(int i=0; i<10; i++){
            page.getValue();
        }
    }
}
