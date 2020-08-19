package com.example.java;

import com.example.java.util.MathHelper;

import java.util.Scanner;

public class Calculator {

        public static void main(String[] args) {
            Calculator calc = new Calculator();
            calc.calculate();
        }

    protected4 void calculate() {
        InputHelper helper = new InputHelper();
        String s1 = helper.getInput("Enter a numeric value: ");
        String s2 = helper.getInput("Enter a numeric value: ");
        String op = helper.getInput("Choose operation (+ - * /): ");
        double result = 0;

        try{
            switch(op){
                case "+":
                    result = MathHelper.addVal(s1,s2);
                    break;

                case "-":
                    result = MathHelper.subVal(s1,s2);
                    break;

                case "*":
                    result = MathHelper.mulVal(s1,s2);
                    break;

                case "/":
                    result = MathHelper.divVal(s1,s2);
                    break;

                default:
                    System.out.println("Unrecognized operation");
                    return;
            }
            System.out.println("The answer is " +result);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    class InputHelper{
        private String getInput(String prompt){
            System.out.println(prompt);
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }
    }
    
}
