package com.appnomic.owner;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Reloadable;

/**
 * Created by hemanth on 20/8/14.
 */
@Config.Sources("classpath:ProgramReload.properties")
public interface ReloadableConfig extends Reloadable, Config {

    @Config.Key("classStrength")
    Integer classStrength();
}
