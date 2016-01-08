package com.polarnick.mathlogic.assumptionCheckerAndConverter.entities;

/**
 * Date: 10.01.14 at 19:40
 *
 * @author Nickolay Polyarniy aka PolarNick
 */
public class Disjunction extends BinaryExpression {

    public Disjunction(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    String getOperator() {
        return "|";
    }

}