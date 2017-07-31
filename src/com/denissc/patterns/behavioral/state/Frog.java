package com.denissc.patterns.behavioral.state;

public class Frog {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(){
        if (activity instanceof Sleep) {
            setActivity(new Eating());
        } else if (activity instanceof Eating) {
            setActivity(new Sleep());
        }
    }

    public void doActivity(){
        activity.doActivity();
    }
}
