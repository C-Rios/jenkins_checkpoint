package org.earlycareers;

public class CalculatorOperations {
    public static void main(String[] args) {
        System.out.println("Juan Camilo's Jenkins pipeline!");
    }

    public double sum(double a, double b){
        return a + b;
    }
    public double subtraction(double a, double b){
        return a - b;
    }
    public double product(double a, double b){
        return a * b;
    }
    public double division(double a, double b){
        if ( b != 0 )
            return a / b;
        return 0;
    }

    public double powerOf(double a, double b){
        return Math.pow(a,b);
    }

}