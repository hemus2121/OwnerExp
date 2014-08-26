package com.appnomic.owner.Impl;

import com.appnomic.owner.ConverterInterface;
import org.aeonbits.owner.ConfigFactory;

/**
 * Created by hemanth on 19/8/14.
 */
public class TestConverter {
    public static void main(String[] args) {
        ConverterInterface cfg = ConfigFactory.create(ConverterInterface.class);
        //Printing single value
        System.out.println(cfg.server().toString());

        //Printing list of values
        for (Server servers : cfg.servers())
            System.out.println(servers.toString());
    }

}
