package com.appnomic.owner.Impl;

import com.appnomic.owner.MutableConfig;
import org.aeonbits.owner.ConfigFactory;
import org.aeonbits.owner.Mutable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by hemanth on 21/8/14.
 */
public class TestMutable {

    public static void main(String[] args) {
        MutableConfig cfg = ConfigFactory.create(MutableConfig.class);

        assertEquals(Integer.valueOf(18),cfg.minAge());

        String minoldAge =cfg.setProperty("minAge","21");
        String maxoldAge = cfg.setProperty("maxAge","75");
        System.out.println(minoldAge + maxoldAge);
        assertEquals("18", minoldAge);
        System.out.println(cfg.minAge() + cfg.maxAge());
        assertEquals(Integer.valueOf(21),cfg.minAge());

        //now remove minAge Property/

        minoldAge= cfg.removeProperty("minAge");
        assertEquals("21",minoldAge);
        System.out.println(cfg.minAge());
        assertNull(cfg.minAge());

    }
}
