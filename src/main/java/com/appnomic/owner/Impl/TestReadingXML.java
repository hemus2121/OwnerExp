package com.appnomic.owner.Impl;

import com.appnomic.owner.ReadingXML;
import org.aeonbits.owner.ConfigFactory;

/**
 * Created by hemanth on 26/8/14.
 */
public class TestReadingXML {

    public static void main(String[] args) {
ReadingXML cfg = ConfigFactory.create(ReadingXML.class);
System.out.println(cfg);
        System.out.println(cfg.httpPort());
        }//+":"+ cfg.reloadInterval());

        }
