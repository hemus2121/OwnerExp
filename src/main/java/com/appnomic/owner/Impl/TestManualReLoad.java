package com.appnomic.owner.Impl;

import com.appnomic.owner.ReloadableConfig;
import org.aeonbits.owner.ConfigFactory;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by hemanth on 20/8/14.
 */
public class TestManualReLoad {
    public static void main(String[] args) {
        ReloadableConfig cfg = ConfigFactory.create(ReloadableConfig.class);
        System.out.println(cfg.classStrength());

        Map newValueMap = new HashMap();
        newValueMap.put("classStrength","200");
        //Old value still persists
        assertEquals(Integer.valueOf("50"),cfg.classStrength());

        cfg = ConfigFactory.create(ReloadableConfig.class,newValueMap);
        cfg.reload();
        //New value got updated
        assertEquals(Integer.valueOf("200"),cfg.classStrength());


    }
}
