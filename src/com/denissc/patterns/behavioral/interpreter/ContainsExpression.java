package com.denissc.patterns.behavioral.interpreter;

/**
 * Created by denissc on 28.07.17.
 */
public class ContainsExpression implements Expression {
    String needle;

    public ContainsExpression(String needle) {
        this.needle = needle;
    }

    @Override
    public boolean interpret(String haystack) {
        return haystack.contains(needle);
    }
}
