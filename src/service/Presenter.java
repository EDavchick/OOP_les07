package service;

import views.Calculator;
import views.View;

public class Presenter {
    Calculator calculator;
    View view;

    public Presenter(Calculator calculator, View view) {
        this.calculator = calculator;
        this.view = view;
    }
    public void putNumbers(){
        while (true) {
            double numberA = view.getNumber("Number a: ");
            double numberB = view.getNumber("Number b: ");
            calculator.getNumberA(numberA);
            calculator.getNumberB(numberB);
            double result = calculator.getResult();
            view.printResult(result, "Result: ");

//            boolean isInt = (numberA ==  Math.rint(numberA)) && Double.isInfinite(numberA);
//            if (isInt) System.out.println("not a number");
//            if(!Double.isInfinite(numberA) && numberA != (int)numberA){
//            System.out.println("not a number");}
        }
    }
}
