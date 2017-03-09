package com.mysite;

/**
 * Created by user on 09.03.2017.
 */

public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
