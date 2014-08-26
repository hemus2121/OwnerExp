package com.appnomic.owner.Impl;

/**
 * Created by hemanth on 19/8/14.
 */
public class Server {

    private final String name;
    private final Integer port;

    public String getName() {
        return name;
    }

    public Integer getPort(){
        return  port;
    }

    Server(String name, Integer port){
        this.name= name;
        this.port= port;
    }

    @Override
    public String toString() {
        return name + ":" + port;
    }


}
