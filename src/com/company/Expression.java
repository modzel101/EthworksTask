package com.company;

import java.util.*;

public class Expression {
    private List<Double> constant;
    private List<Double> exponent;
    private Map<Double, Double> expr;

    Expression(Expression exp) {
        this.constant = exp.constant;
        this.exponent = exp.exponent;
        this.expr = exp.expr;
    }

    Expression(List<Double> constant, List<Double> exponent) throws Exception {
        if (constant.size() != exponent.size())
            throw new Exception("Constants list size is not equal to exponents list size.");
        this.constant = constant;
        this.exponent = exponent;
        this.expr = this.simplify();
    }

    @Override
    public String toString() {
        String sExpr = "";
        for (Double key: this.expr.keySet()) {
            //constant not 0
            if (!this.expr.get(key).equals(0.0))
                //exponent not 0
                if (!key.equals(0.0)) {
                    //exponent == 1
                    if (key.equals(1.0))
                        sExpr = sExpr.concat(constToString(this.expr.get(key)) + "x");
                    else
                        sExpr = sExpr.concat(constToString(this.expr.get(key)) + "x^" + expToString(key));
                }
                else
                    sExpr = sExpr.concat(constToString(this.expr.get(key)));
        }
        return sExpr.substring(1);
    }

    private Map simplify() {
        HashMap<Double, Double> simplified = new HashMap();
        int expLength = this.constant.size();
        for (int i = 0; i < expLength; i++) {
            if (!simplified.containsKey(this.exponent.get(i)))
                simplified.put(this.exponent.get(i), this.constant.get(i));
            else
                simplified.put(this.exponent.get(i), simplified.get(this.exponent.get(i)) + this.constant.get(i));
        }
        TreeMap<Double, Double> sortedMap = new TreeMap<Double, Double>(simplified);
        return sortedMap.descendingMap();
    }

    private String constToString(Double d) {
        if (d.intValue() == d) {
            if (d < 0)
                if(d.intValue() == -1)
                    return "-";
                else
                    return String.valueOf(d.intValue());
            else
                if (d.intValue() == 1)
                    return "+";
                else
                    return "+" + d.intValue();
        }
        else {
            if (d < 0)
                return String.valueOf(d);
            else
                return "+" + d;
        }
    }

    private String expToString(Double d) {
        if (d.intValue() == d)
            return String.valueOf(d.intValue());
        else
            return String.valueOf(d);
    }

    public Map<Double, Double> getExpr() {
        return this.expr;
    }
}
