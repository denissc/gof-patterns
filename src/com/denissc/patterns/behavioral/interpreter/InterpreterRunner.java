package com.denissc.patterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression expression = getPhpOrJavaExpression();
        Expression expression2 = getPhpAndJavaExpression();

        String string = "java is not php";
        String string1 = "java strong";
        String string2 = "sun shine brightly";

        System.out.println(string + " " + expression.interpret(string));
        System.out.println(string1 + " " + expression.interpret(string1));
        System.out.println(string2 + " " + expression.interpret(string2));
        System.out.println(string + " " + expression2.interpret(string));
        System.out.println(string1 + " " + expression2.interpret(string1));
        System.out.println(string2 + " " + expression2.interpret(string2));

    }

    public static Expression getPhpOrJavaExpression(){
        return new OrExpression(
                new ContainsExpression("java"),
                new ContainsExpression("php")
        );
    }

    public static Expression getPhpAndJavaExpression(){
        return new AndExpression(
                new ContainsExpression("java"),
                new ContainsExpression("php")
        );
    }
}
