package model;

import service.CalcDecorator;

public class CalcMulti extends CalcDecorator {


    @Override
    public void getNumberA(double value) {
        super.numberA = value;
    }

    @Override
    public void getNumberB(double value) {
        super.numberB = value;
    }

    @Override
    public double getResult() {
        return numberA * numberB;
    }
}
