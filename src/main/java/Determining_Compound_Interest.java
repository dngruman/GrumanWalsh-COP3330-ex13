/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Deirdre Gruman-Walsh
 */import java.util.Scanner;

public class Determining_Compound_Interest {
        public static void main(String[] args) {
            Scanner user_input = new Scanner(System.in);
            double p, r, t, n, A, BaseNum, PowerNum, exp;

            //User enter Inputs
            System.out.print("Enter the principal: ");
            p = user_input.nextDouble();
            System.out.print("Enter the rate of interest: ");
            r = user_input.nextDouble();
            System.out.print("Enter the number of years: ");
            t = user_input.nextDouble();
            System.out.print("Enter the number of times the interest is compounded per year: ");
            n = user_input.nextDouble();

            //Calculating Interest while converting input interest to percentage
            BaseNum = (1 + (r/100)/n);
            PowerNum = n*t;
            exp = Math.pow(BaseNum , PowerNum);
            A = p*exp;
            //Output of calculation Displayed
            System.out.println("$" +String.format("%.0f",p)+ " invested for " +String.format("%.0f", t)+ " years at " +String.format("%.1f", r)+ "%, the investment will be worth $" +String.format("%.2f", A)+ ".");
        }
    }

