package com.company;

public class ExpressionsOperations {

    public Expression addTwoExpressions(Expression exp1, Expression exp2) {
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
