package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class AddAndPrintExpression {

    public static void main(String[] args) throws Exception {
        Expression exp1 = new Expression(Arrays.asList(3.0, 1.0, 5.0, 1.0, 3.0, -3.0, 3.0), Arrays.asList(2.0, 2.0, 4.0, 1.0, 6.0, 5.0, 1.0));
        Expression exp2 = new Expression(Arrays.asList(3.0, 1.0, 5.0), Arrays.asList(2.0, 6.0, 9.0));
        ExpressionsOperations expOp = new ExpressionsOperations();
        System.out.println("Simplified first expression: \n" + exp1.toString());
        System.out.println("Simplified second expression: \n" + exp2.toString());
        Expression result = expOp.addTwoExpressions(exp1, exp2);
        System.out.println("Simplified result of adding two expressions: \n" + result.toString());
    }

}
