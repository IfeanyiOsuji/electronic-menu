package com.ify.co.ad;

public class AdvertisementStorage {

    private static AdvertisementStorage instance;

    private AdvertisementStorage(){

    }
    public static AdvertisementStorage getInstance(){
        if(instance == null){
            instance = new AdvertisementStorage();
        }
        return instance;
    }
}
