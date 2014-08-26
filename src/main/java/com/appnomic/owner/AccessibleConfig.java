package com.appnomic.owner;

import org.aeonbits.owner.Accessible;
import org.aeonbits.owner.Config;


/**
 * Created by hemanth on 22/8/14.
 */
/*public interface AccessibleConfig extends Config, Accessible {

    @Config.DefaultValue("BackStreet Boyz")
    String favSong();

    @Config.Key("SalvationText")
    @Config.DefaultValue("Good morning")
    String salutation();
}*/

public interface AccessibleConfig extends Accessible {
    @Config.DefaultValue("Bohemian Rapsody - Queen")
    String favoriteSong();

    @Config.Key("salutation.text")
    @Config.DefaultValue("Good Morning")
    String salutation();
}