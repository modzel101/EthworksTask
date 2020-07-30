package com.company;

import java.util.ArrayList;
import java.util.List;

public class Expression {
    private List<Double> constant;
    private List<Double> exponent;

    Expression() {
        this.constant = new ArrayList<>();
        this.exponent = new ArrayList<>();
    }

    Expression(List<Double> constant, List<Double> exponent) throws Exception {
        if (constant.size() != exponent.size())
            throw new Exception("Constants list size is not equal to exponents list size.");
        this.constant = constant;
        this.exponent = exponent;
    }


    private void simplify() {

    }

    @Override
    public String toString() {
        String exp = "";
        int expLength = constant.size();
        System.out.println(expLength);
        for (int i = 0; i<expLength; i++)
            if(this.exponent.get(i) == 0)
                exp = exp.concat("+" + this.constant.get(i));
            else
                exp = exp.concat("+" + this.constant.get(i) + "x^" + this.exponent.get(i));
        return exp;
    }
}
