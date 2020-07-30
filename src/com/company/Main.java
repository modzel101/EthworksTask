package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        Expression exp1 = new Expression(Arrays.asList(3.0, 1.0, 5.0, 1.0, 3.0, -3.0, 3.0), Arrays.asList(2.0, 2.0, 4.0, 1.0, 6.0, 5.0, 1.0));
        Expression exp2 = new Expression(Arrays.asList(3.0, 1.0, 5.0), Arrays.asList(2.0, 6.0, 9.0));
        System.out.println("Simplified first expression: \n" + exp1.toString());
        System.out.println("Simplified second expression: \n" + exp2.toString());
        Expression result = addTwoExpressions(exp1, exp2);
        System.out.println("Simplified result of adding two expressions: \n" + result.toString());
    }

    private static Expression addTwoExpressions(Expression exp1, Expression exp2) {
        Expression returnedExpression = new Expression(exp1);
        for (Double exp: exp2.getExpr().keySet()) {
            if (!returnedExpression.getExpr().containsKey(exp))
                returnedExpression.getExpr().put(exp, exp2.getExpr().get(exp));
            else
                returnedExpression.getExpr().put(exp, returnedExpression.getExpr().get(exp) + exp2.getExpr().get(exp));
        }
        return returnedExpression;
    }
}
