package com.appnomic.owner;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;
import java.io.PrintStream;

@LoadPolicy(LoadType.MERGE)
@Sources({ "file:~/A1Health/appsone-health-script/src/main/config/alert.properties",
        "classpath:ServerConfig.properties"})

public interface MyConfig extends Config {

    @Key("server.http.port")
    int port();

    //For String it returns empty if value is not specified in properties file
    @Key("server.host.name")
    @DefaultValue("ibmlaptop")
    String hostname();

    @Key("server.maxThreads")
    @DefaultValue("42")
    int maxThreads();

    //debugging facilities
    void list(PrintStream out);

    //Reading from generic file
    @Key("AlertHOST")
    String alertHost();

    @Key("AlertPORT")
    String alertPort();

    @Key("AlertENDPOINT")
    String alertEndPoint();
}
