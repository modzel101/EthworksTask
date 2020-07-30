package com.company;

import org.junit.Rule;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AddAndPrintExpressionTest {
    @Test
    public void testAddTwoExpressions() throws Exception {
        ExpressionsOperations expOp = new ExpressionsOperations();
        Expression exp11 = new Expression(Arrays.asList(3.0, 1.0, 5.0, 1.0, 3.0, -3.0, 3.0), Arrays.asList(2.0, 2.0, 4.0, 1.0, 6.0, 5.0, 1.0));
        Expression exp21 = new Expression(Arrays.asList(3.0, 1.0, 5.0), Arrays.asList(2.0, 6.0, 9.0));
        assertEquals("5x^9+4x^6-3x^5+5x^4+7x^2+4x^1", expOp.addTwoExpressions(exp11, exp21).toString());

        Expression exp12 = new Expression(Arrays.asList(-2.0, -3.14, 5.0, -2.0), Arrays.asList(-54.0, 2.8, 4.0, 7.0));
        Expression exp22 = new Expression(Arrays.asList(2.0, 6.28, -2.0, 2.0), Arrays.asList(54.0, 2.8, 4.0, 7.0));
        assertEquals("2x^54+3x^4+3.14x^2.8-2x^-54", expOp.addTwoExpressions(exp12, exp22).toString());

        Expression exp13 = new Expression(Arrays.asList(-2.0, -3.14, 5.0, -2.0), Arrays.asList(-54.0, 2.8, 0.0, 0.0));
        Expression exp23 = new Expression(Arrays.asList(2.0, 6.2, -2.0, 2.0), Arrays.asList(54.0, 0.0, 4.0, 7.0));
        assertEquals("2x^54+2x^7-2x^4-3.14x^2.8+9.2-2x^-54", expOp.addTwoExpressions(exp13, exp23).toString());
    }
    
}