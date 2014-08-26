package com.appnomic.owner;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Key;
/**
 * Created by hemanth on 18/8/14.
 */
public interface SystemEnvProperties extends Config {

    @Key("file.separator")
    String  fileSeparator();

    @Key("java.home")
    String javaHome();

    @Key("HOME")
    String home();

    @Key("USER")
    String user();

}
