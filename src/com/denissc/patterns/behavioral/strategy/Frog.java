package com.denissc.patterns.behavioral.strategy;

/**
 * Created by denissc on 31.07.17.
 */
public class Frog {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void doActivity(){
        activity.doActivity();
    }
}
