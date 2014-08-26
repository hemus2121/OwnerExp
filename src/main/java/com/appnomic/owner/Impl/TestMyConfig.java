package com.appnomic.owner.Impl;

import com.appnomic.owner.MySources;
import org.aeonbits.owner.ConfigFactory;

/**
 * Created by hemanth on 13/8/14.
 */
public class TestMyConfig {
    public static void main(String[] args) {
        MySources cfg = ConfigFactory.create(MySources.class);
        System.out.println("Server " + cfg.hostname() + ":" +cfg.port() + " will run  " + cfg.maxThreads() + " threads. ");
        System.out.println("Is HostName Null in properties:"+ cfg.hostname().isEmpty());
        //Reading properties info from in Interface using file in @Source
        System.out.println("\nAlert Related info:  AlertHost:" + cfg.alertHost() +" Alert Port: "+ cfg.alertPort() + " AlertEndPoint: "+ cfg.alertEndPoint()) ;
    }
}

