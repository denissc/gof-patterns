package com.denissc.patterns.behavioral.template;

public class SportDisciplineAttemptRunner {
    public static void main(String[] args) {
        SportDisciplineAttempt spearThrowAttempt = new SpearThrowAttempt();
        SportDisciplineAttempt highJumpAttempt = new HighJumpAttempt();

        spearThrowAttempt.performAttempt();
        System.out.println("+++++++++++++++++++++++++++++++");
        highJumpAttempt.performAttempt();
    }
}
