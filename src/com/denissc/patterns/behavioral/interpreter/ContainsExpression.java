package com.denissc.patterns.behavioral.interpreter;

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
