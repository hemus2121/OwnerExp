package com.appnomic.owner;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

import java.io.PrintStream;

/**
 * Created by hemanth on 20/8/14.
 */

@Sources("classpath:VariableExp.properties")


public interface ExpandFromAnotherKey extends Config {

    @DefaultValue("dev")
    String env();

    @Key("servers.${env}.name")
    String name();

    @Key("servers.${env}.hostname")
    String hostname();

    @Key("servers.${env}.port")
    Integer port();

    @Key("servers.${env}.user")
    String user();

    //@DisableFeature(DisableableFeature.VARIABLE_EXPANSION)
    @Key("servers.${env}.password")
    String password();

    //debugging facilities
    void list(PrintStream out);

}

