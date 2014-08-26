package com.appnomic.owner.Impl;

import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

/**
 * Created by hemanth on 19/8/14.
 */
public class ServerConverter implements Converter<Server> {

    @Override
    public Server convert(Method method, String text) {
        //System.out.println(text);
        String[] split  = text.split(":",-1);
        String name = split[0];
        Integer port =80;
        if (split.length >=2){
            port = Integer.parseInt(split[1]);
        }
        return new Server(name,port);
    }
}
