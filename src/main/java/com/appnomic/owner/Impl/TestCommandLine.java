package com.appnomic.owner.Impl;

import com.appnomic.owner.CommandLine;
import org.aeonbits.owner.ConfigFactory;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by hemanth on 18/8/14.
 */
public class TestCommandLine {

    public static void main(String[] args)throws Exception {
        CommandLine cfg;
        if (args.length >0){
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File(args[0])));
            cfg = ConfigFactory.create(CommandLine.class, properties);

            System.out.println("Values form MasterConfig.sh:\n" +cfg.alertingServiceName()+
                    cfg.smtpHost()+":"+cfg.smtpPort()+":"+ cfg.smtpUserName()+":" +
                    cfg.smtpPassword()+ ":"+ cfg.mailFrom() + ":" + cfg.mailTo() +
                    cfg.mailSubject() +":" + cfg.mailBody()+ ":"+ cfg.mailCC());
            System.out.println("MailFrom: "+cfg.mailFrom());
        }else
            System.out.println(" No arguments mentioned");

    }

}
