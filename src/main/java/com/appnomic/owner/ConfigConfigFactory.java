package com.appnomic.owner;

import org.aeonbits.owner.Config;

/**
 * Created by hemanth on 26/8/14.
 */
@Config.Sources("file:${customPath}/AutoReload.properties")
public interface ConfigConfigFactory extends Config {

    @Config.Key("auto.reload.interval")
    String reloadInterval();

}
