package com.appnomic.owner.Impl;

import com.appnomic.owner.AccessibleConfig;
import org.aeonbits.owner.ConfigFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by hemanth on 22/8/14.
 */
public class TestAccessible  {
    public static void main(String[] args) throws IOException {

        AccessibleConfig cfg = ConfigFactory.create(AccessibleConfig.class);
        File tmp = File.createTempFile("TestAccessible", ".tmp");
        cfg.store(new FileOutputStream(tmp), cfg.salutation());

        cfg.list(System.out);
        System.out.println(tmp.getAbsolutePath());

        //Writing to xml
        System.out.println("Writing to xml file");
        File xmlFile = File.createTempFile("XMLLEFI",".tmp");
        cfg.storeToXML(new FileOutputStream(xmlFile),cfg.salutation());

    }
}
