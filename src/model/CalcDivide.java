package model;

import service.CalcDecorator;

public class CalcDivide extends CalcDecorator {
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
        if(numberB == 0) return 0;
        return numberA / numberB;
    }
}
