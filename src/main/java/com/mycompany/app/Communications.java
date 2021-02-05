package com.mycompany.app;
public class Communications{
    public TelephonesFixedLines telephones_fixed_lines;
    public TelephonesMobileCellular telephones_mobile_cellular;
    public TelephoneSystem telephone_system;
    public String broadcast_media;
    public String internet_country_code;
    public InternetUsers internet_users;
    public BroadbandFixedSubscriptions broadband_fixed_subscriptions;

    public TelephonesFixedLines getTelephones_fixed_lines() {
        return telephones_fixed_lines;
    }

    public void setTelephones_fixed_lines(TelephonesFixedLines telephones_fixed_lines) {
        this.telephones_fixed_lines = telephones_fixed_lines;
    }

    public TelephonesMobileCellular getTelephones_mobile_cellular() {
        return telephones_mobile_cellular;
    }

    public void setTelephones_mobile_cellular(TelephonesMobileCellular telephones_mobile_cellular) {
        this.telephones_mobile_cellular = telephones_mobile_cellular;
    }

    public TelephoneSystem getTelephone_system() {
        return telephone_system;
    }

    public void setTelephone_system(TelephoneSystem telephone_system) {
        this.telephone_system = telephone_system;
    }

    public String getBroadcast_media() {
        return broadcast_media;
    }

    public void setBroadcast_media(String broadcast_media) {
        this.broadcast_media = broadcast_media;
    }

    public String getInternet_country_code() {
        return internet_country_code;
    }

    public void setInternet_country_code(String internet_country_code) {
        this.internet_country_code = internet_country_code;
    }

    public InternetUsers getInternet_users() {
        return internet_users;
    }

    public void setInternet_users(InternetUsers internet_users) {
        this.internet_users = internet_users;
    }

    public BroadbandFixedSubscriptions getBroadband_fixed_subscriptions() {
        return broadband_fixed_subscriptions;
    }

    public void setBroadband_fixed_subscriptions(BroadbandFixedSubscriptions broadband_fixed_subscriptions) {
        this.broadband_fixed_subscriptions = broadband_fixed_subscriptions;
    }
}
