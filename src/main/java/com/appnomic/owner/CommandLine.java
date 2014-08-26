package com.appnomic.owner;

import com.sun.istack.internal.NotNull;
import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Key;


/**
 * Created by hemanth on 18/8/14.
 */
public interface CommandLine extends Config{

    /*ALERTING_SERVICE_NAME="appsoneas"
    SMTP_HOST="172.16.1.102"
    SMTP_PORT="25"
    SMTP_USERNAME=""
    SMTP_PASSWORD=""
    MAIL_FROM="sheelkumar.g@appnomic.com"
    MAIL_TO="sheelkumar.g@appnomic.com"
    MAIL_SUBJECT="Alerting Service is down."
    MAIL_BODY="Dear Administrator,
    Please Check for Alerting Service. It is down.
            Regards,
    Automation Team."
    MAIL_CC="sheelkumar.g@appnomic.com" */

    @Key("ALERTING_SERVICE_NAME")
    @DefaultValue("appsoneas")
    String alertingServiceName();

    @Key("SMTP_HOST")
    String smtpHost();

    @Key("SMTP_PORT")
    String smtpPort();

    @Key("SMTP_USERNAME")
    String  smtpUserName();

    @Key("SMTP_PASSWORD")
    String smtpPassword();

    @Key("MAIL_FROM")
    @NotNull
    @DefaultValue("SupportAppnomic")
    String mailFrom();

    @Key("MAIL_TO")
    String mailTo();

    @Key("MAIL_SUBJECT")
    @DefaultValue("Alerting Service is down.")
    String mailSubject();

    @Key("MAIL_BODY")
    @DefaultValue("Dear Administrator,\n" +
            "\n" +
            "Please Check for Alerting Service. It is down.\n" +
            "\n" +
            "Regards,\n" +
            "Automation Team.")
    String mailBody();

    @Key("MAIL_CC")
    String mailCC();
}
