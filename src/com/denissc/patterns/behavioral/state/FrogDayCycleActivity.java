package com.denissc.patterns.behavioral.state;

public class FrogDayCycleActivity {
    public static void main(String[] args) {
        Activity activity = new Sleep();
        Frog frog = new Frog();

        frog.setActivity(activity);

        for (int i = 0; i< 10;i++) {
            frog.doActivity();
            frog.changeActivity();
        }
    }
}
