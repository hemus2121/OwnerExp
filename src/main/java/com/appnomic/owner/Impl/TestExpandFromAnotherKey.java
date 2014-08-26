package com.appnomic.owner.Impl;

import com.appnomic.owner.ExpandFromAnotherKey;
import org.aeonbits.owner.ConfigFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by hemanth on 20/8/14.
 */
public class TestExpandFromAnotherKey {

    public static void main(String[] args) {
        Map values = new HashMap();
        values.put("env","prod");

        ExpandFromAnotherKey cfg = ConfigFactory.create(ExpandFromAnotherKey.class,values);
        System.out.println( cfg.env()+": "+ cfg.name() + ":"+ cfg.hostname()+":"+ cfg.port()+ ":"+ cfg.user()+ ":"+cfg.password());

    }
}
