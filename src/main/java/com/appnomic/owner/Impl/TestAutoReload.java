package com.appnomic.owner.Impl;

import com.appnomic.owner.AutoReloadConfig;
import org.aeonbits.owner.ConfigFactory;
import org.aeonbits.owner.event.ReloadEvent;
import org.aeonbits.owner.event.ReloadListener;
import java.util.Date;

/**
 * Created by hemanth on 20/8/14.
 */
public class TestAutoReload {
    public static void main(String[] args) {
        final AutoReloadConfig config = ConfigFactory.create(AutoReloadConfig.class);
        System.out.println("Original Value: "+config.interval());
        config.addReloadListener(new ReloadListener() {
            @Override
            public void reloadPerformed(ReloadEvent event) {
                System.out.println("\nReloadIntercepted at :"+ new Date() +"\n");
                System.out.println("New Value after reload: "+ config.interval());
            }
        });
        System.out.println("Change file and see the changes");

        //New value
        int newValue =0;
        while (newValue >=0){
            newValue = config.interval();
            System.out.println("New Value: "+ newValue);
           try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
