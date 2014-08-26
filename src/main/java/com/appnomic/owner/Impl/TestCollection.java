package com.appnomic.owner.Impl;

import com.appnomic.owner.CollectionConfig;
import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

import java.net.URL;

/**
 * Created by hemanth on 19/8/14.
 */
public class TestCollection {
    public static void main(String[] args) {
        CollectionConfig cfg = ConfigFactory.create(CollectionConfig.class);

        //Printing states
        for (String s: cfg.states())
            System.out.println(s);

        //Printing fibo values
        for(int i: cfg.fibo())
            System.out.println(i);

        //Printing values from Path
       for (String s: cfg.path()){
           System.out.println(s);
       }

       // Printing Integers
        for (Integer i : cfg.ints()){
            System.out.println(i);
        }

        //Printing bookmarks
        for (URL url : cfg.myBookmarks()){
            System.out.println(url.toString());
        }

        //Printing Stack
        for (String s: cfg.books()){
            System.out.println(s);
        }
    }
}
