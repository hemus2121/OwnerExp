package com.appnomic.owner;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Mutable;

/**
 * Created by hemanth on 21/8/14.
 */
public interface MutableConfig extends Mutable{

    @Config.DefaultValue("18")
    public Integer minAge();
    public Integer maxAge();
}
