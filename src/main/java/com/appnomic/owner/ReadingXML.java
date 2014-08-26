package com.appnomic.owner;

import oracle.jrockit.jfr.StringConstantPool;
import org.aeonbits.owner.Config;

/**
 * Created by hemanth on 26/8/14.
 */
@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"classpath:UserSpecifiedXML.xml",
                 "classpath:AutoReload.properties" })

//@Config.Sources("classpath:UserSpecifiedXML.xml,AutoReload.properties")
public interface ReadingXML extends Config{


    @Key("server.http.port")
    int httpPort();

    @Key("server.http.hostname")
    String httpHostName();

    @Key("server.ssh.port")
    int sshPort();

    @Key("server.ssh.address")
    String sshAddress();

    @Key("server.ssh.alive")
    int alivePeriod();

    @Key("server.ssh.user")
    String sshUser();

    @Key("auto.reload.interval")
    String reloadInterval();

}
