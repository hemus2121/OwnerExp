package com.appnomic.owner.Impl;


import com.appnomic.owner.ConfigConfigFactory;
import org.aeonbits.owner.ConfigFactory;
import org.junit.Assert;

/**
 * Created by hemanth on 26/8/14.
 */
public class TestConfigFactory {

    public static void main(String[] args) {
        ConfigFactory.setProperty("customPath", "${HOME}/A1Health/OwnerExp/src/main/resources");

        ConfigConfigFactory cfg = ConfigFactory.create(ConfigConfigFactory.class);
        System.out.println(cfg.reloadInterval());
        Assert.assertEquals("500", cfg.reloadInterval());
    }


}

