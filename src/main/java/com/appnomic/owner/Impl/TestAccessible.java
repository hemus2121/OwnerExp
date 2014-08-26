package com.appnomic.owner.Impl;

import com.appnomic.owner.AccessibleConfig;
import org.aeonbits.owner.ConfigFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by hemanth on 22/8/14.
 */
public class TestAccessible  {
    public static void main(String[] args) throws IOException {

        AccessibleConfig cfg = ConfigFactory.create(AccessibleConfig.class);
        //Printing list
        cfg.list(System.out);
        //Assert whether getProperty works
        assertEquals("Good Morning",cfg.getProperty("salutation.text"));

        File tmp = File.createTempFile("TestAccessible", ".tmp");
        cfg.store(new FileOutputStream(tmp), cfg.salutation());

        System.out.println(tmp.getAbsolutePath());

        //Writing to xml
        System.out.println("\nWriting to xml file");
        File xmlFile = File.createTempFile("XMLLEFI",".tmp");
        cfg.storeToXML(new FileOutputStream(xmlFile),cfg.salutation());

    }
}
