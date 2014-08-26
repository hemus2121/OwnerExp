package com.appnomic.owner;

import com.appnomic.owner.Impl.Server;
import com.appnomic.owner.Impl.ServerConverter;
import org.aeonbits.owner.Config;

/**
 * Created by hemanth on 19/8/14.
 */
public interface ConverterInterface  extends Config{

    @DefaultValue("fusball.com:8080")
    @ConverterClass(ServerConverter.class)
    Server server();

    @DefaultValue("google.com,yahoo.com:8080,owner.sample.com:4040")
    @Config.ConverterClass(ServerConverter.class)
    Server[] servers();
}
