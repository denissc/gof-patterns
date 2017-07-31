package com.denissc.patterns.behavioral.strategy;

public class Frog {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void doActivity(){
        activity.doActivity();
    }
}
