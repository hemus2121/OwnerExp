package com.appnomic.owner.Impl;

import org.aeonbits.owner.ConfigFactory;
import org.junit.Assert;

import java.io.File;

import com.appnomic.owner.SystemEnvProperties;
/**
 * Created by hemanth on 18/8/14.
 */
public class TestEnvProperties {
   public static void main(String [] args){
      SystemEnvProperties cfg;
       cfg = ConfigFactory.create(SystemEnvProperties.class, System.getProperties(), System.getenv());

       System.out.println(System.getenv());
       Assert.assertEquals(File.separator, cfg.fileSeparator());
       Assert.assertEquals(System.getProperty("java.home"), cfg.javaHome());
       Assert.assertEquals(System.getenv().get("HOME"), cfg.home());
       Assert.assertEquals(System.getenv().get("USER"), cfg.user());

   }
}
