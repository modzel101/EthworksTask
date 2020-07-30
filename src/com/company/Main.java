package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        Expression exp1 = new Expression(Arrays.asList(3.0, 1.0, 5.0), Arrays.asList(1.38, 2.56, 4.3));
        Expression exp2 = new Expression(Arrays.asList(3.0, 1.0, 5.0), Arrays.asList(1.38, 2.56, 4.3));
        System.out.println(exp1.toString());
    }

    private Expression addTwoExpressions (Expression exp1, Expression exp2) {

        return new Expression();
    }
}
