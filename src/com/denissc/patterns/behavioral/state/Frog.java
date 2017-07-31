package com.denissc.patterns.behavioral.state;

/**
 * Created by denissc on 31.07.17.
 */
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
