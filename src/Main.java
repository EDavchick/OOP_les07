import model.CalcDivide;
import model.CalcMulti;
import model.CalcSum;
import service.Presenter;
import views.View;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Presenter sum = new Presenter(new CalcSum(), new View());
        Presenter multi = new Presenter(new CalcMulti(), new View());
        Presenter divide = new Presenter(new CalcDivide(), new View());
        sum.putNumbers();
        multi.putNumbers();
        divide.putNumbers();
    }

    /** всё на одной странице, не обращать внимание
     * static double getNumber(){
     *         Scanner in = new Scanner(System.in);
     *         System.out.print("Input a number: ");
     *         double number = in.nextDouble();
     *         return number;
     *     }
     *     static double getSum(double numberA, double numberB) {
     *         return numberA + numberB;
     *     }
     *     static double getMulti(double numberA, double numberB) {
     *         return numberA * numberB;
     *     }
     *     static double getDivide(double numberA, double numberB) {
     *         if(numberB == 0) return 0;
     *         return numberA / numberB;
     *     }
     *     static void printResult(double result){
     *         System.out.println("Result: " + result);;
     *     }
     * @return
     */

}