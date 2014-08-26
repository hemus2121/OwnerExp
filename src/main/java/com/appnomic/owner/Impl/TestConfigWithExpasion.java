package com.appnomic.owner.Impl;

import com.appnomic.owner.ConfigwithExpansion;
import org.aeonbits.owner.ConfigFactory;

/**
 * Created by hemanth on 20/8/14.
 */
public class TestConfigWithExpasion {

    public static void main(String[] args) {
        ConfigwithExpansion cfg = ConfigFactory.create(ConfigwithExpansion.class);
        System.out.println(cfg.story() + ": "+ cfg.animal() + ": "+cfg.target()+ ":" +cfg.targetAttribute() +":" + cfg.color());
    }
}
