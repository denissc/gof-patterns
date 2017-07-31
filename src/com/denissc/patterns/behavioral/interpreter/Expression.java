package com.denissc.patterns.behavioral.interpreter;

/**
 * Created by denissc on 28.07.17.
 */
public interface Expression {
    public boolean interpret(String context);
}
