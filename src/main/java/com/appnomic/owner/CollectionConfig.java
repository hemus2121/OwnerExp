package com.appnomic.owner;

import com.appnomic.owner.Impl.Constants;
import com.sun.istack.internal.NotNull;
import org.aeonbits.owner.Config;

import java.io.File;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

import static java.io.File.*;

/**
 * Created by hemanth on 19/8/14.
 */
public interface CollectionConfig extends Config {

    @DefaultValue("kar,tn,ker")
    public String[] states();

    @Separator(";")
    @DefaultValue("0;1;1;2;3;5")
    public int [] fibo();


    @TokenizerClass( Constants.class)
    @DefaultValue("a:b:c")
    //@Separator(Constants.class)
    String[] path();

    @DefaultValue("1,2,3,4")
    List<Integer> ints();

    @DefaultValue(
            "http://aeonbits.org, http://github.com, http://google.com")
    Collection<URL> myBookmarks();

    @DefaultValue("digital fortress,spiderman, heman")
    Stack<String> books();

}
