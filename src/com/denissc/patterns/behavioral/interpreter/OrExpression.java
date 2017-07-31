package com.denissc.patterns.behavioral.interpreter;

/**
 * Created by denissc on 28.07.17.
 */
public class OrExpression implements Expression {
    Expression expression1;
    Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) || expression1.interpret(context);
    }
}
