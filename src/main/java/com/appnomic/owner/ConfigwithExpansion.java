package com.appnomic.owner;

import org.aeonbits.owner.Config;

/**
 * Created by hemanth on 20/8/14.
 */
public interface ConfigwithExpansion extends Config {

    @DefaultValue ( "The ${animal} jumped over the ${target} ")
    String story();

    @DisableFeature(DisableableFeature.VARIABLE_EXPANSION)
    @DefaultValue("quick ${color} fox")
    String animal();

    @DefaultValue("${target.attribute} dog")
    String target();

    @Config.Key("target.attribute")
    @DefaultValue("lazy")
    String targetAttribute();

    @DefaultValue("brown")
    String color();

}
