package com.appnomic.owner.Impl;

import org.aeonbits.owner.Tokenizer;

import java.io.File;
import java.nio.file.FileSystem;

/**
 * Created by hemanth on 19/8/14.
 */
public class Constants implements Tokenizer{
    public String [] tokens (String values){
        return  values.split(File.pathSeparator,-1);
    }
}
