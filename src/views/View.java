package views;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);
    public double getNumber(String title){
        //if(!Double.isInfinite(in.nextDouble()) && in.nextDouble() != (int)in.nextDouble()){ return 0;}
        System.out.printf("%s", title);
        return in.nextDouble();
    }
    public void printResult(double result, String title){
        System.out.printf("%s %f\n", title, result);
    }
}
