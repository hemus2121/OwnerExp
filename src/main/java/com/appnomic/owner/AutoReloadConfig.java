package com.appnomic.owner;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Reloadable;
import org.aeonbits.owner.Config.HotReload;
import org.aeonbits.owner.Config.Sources;
import org.aeonbits.owner.Config.HotReloadType;

import java.util.concurrent.TimeUnit;

/**
 * Created by hemanth on 20/8/14.
 */

@HotReload(value =15, unit= TimeUnit.SECONDS, type=Config.HotReloadType.ASYNC)
//@HotReload(value =500, unit = TimeUnit.MILLISECONDS)
//@HotReload(type=HotReloadType.ASYNC)
//@HotReload(value =2, type= Config.HotReloadType.ASYNC)
//@HotReload(2, unit= TimeUnit.MILLISECONDS ,type= Config.HotReloadType.ASYNC
// )
@Sources("file:/home/hemanth/A1Health/ExperOwner/src/main/resources/AutoReload.properties")
public interface AutoReloadConfig extends Reloadable,Config {

    @Key("auto.reload.interval")
    Integer interval();

}
