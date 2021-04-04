package com.daniela;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        problem1();

//        problem2();

//        problem3();

//        problem4();

//        problem5();

//        problem6();

        problem7();
    }


    public static void problem1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number A: ");
        double numberA = scanner.nextDouble();

        System.out.print("Enter number B: ");
        double numberB = scanner.nextDouble();

        System.out.print("Enter number C: ");
        double numberC = scanner.nextDouble();

        if (numberC >= numberA && numberC <= numberB) {
            System.out.printf("%.2f is between %.2f and %.2f", numberC, numberA, numberB);
        } else {
            System.out.printf("%.2f is NOT between %.2f and %.2f", numberC, numberA, numberB);
        }
    }

    public static void problem2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer A: ");
        int numberA = scanner.nextInt();

        System.out.print("Enter integer B: ");
        int numberB = scanner.nextInt();

        int intSum = numberA + numberB;
        int intSub = numberA - numberB;
        int intProduct = numberA * numberB;
        int intQuotient = numberA / numberB;
        int intReminder = numberA % numberB;

        System.out.printf("Sum of integers is: %d \n", intSum);
        System.out.printf("Subtraction of integers is: %d\n", intSub);
        System.out.printf("Product of integers is: %d\n", intProduct);
        System.out.printf("Division of integers is: %d\n", intQuotient);
        System.out.printf("Reminder of division is: %d\n", intReminder);

        System.out.println();

        System.out.print("Enter floating point number A: ");
        double floatA = scanner.nextDouble();

        System.out.print("Enter floating point number B: ");
        double floatB = scanner.nextDouble();

        double floatSum = floatA + floatB;
        double floatSub = floatA - floatB;
        double floatProduct = floatA * floatB;
        double floatQuotient = floatA / floatB;
        double floatReminder = floatA % floatB;

        System.out.printf("Sum of floats is: %f \n", floatSum);
        System.out.printf("Subtraction of floats is: %f\n", floatSub);
        System.out.printf("Product of float is: %f\n", floatProduct);
        System.out.printf("Division of floats is: %f\n", floatQuotient);
        System.out.printf("Reminder of division of floats is: %f\n", floatReminder);
    }

    public static void problem3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer A: ");
        int numberA = scanner.nextInt();

        System.out.print("Enter integer B: ");
        int numberB = scanner.nextInt();

        int helper = numberA;
        numberA = numberB;
        numberB = helper;

        System.out.printf("Integer A now is: %d\n", numberA);
        System.out.printf("Integer B now is: %d\n", numberB);
    }

    public static void problem4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer A: ");
        int numberA = scanner.nextInt();

        System.out.print("Enter integer B: ");
        int numberB = scanner.nextInt();

        if (numberA > numberB) {
            System.out.printf("%d, %d", numberB, numberA);
        } else {
            System.out.printf("%d, %d", numberA, numberB);
        }
    }

    public static void problem5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer A: ");
        int numberA = scanner.nextInt();

        System.out.print("Enter integer B: ");
        int numberB = scanner.nextInt();

        System.out.print("Enter integer C: ");
        int numberC = scanner.nextInt();

        if (numberA >= numberB && numberA >= numberC) {
            if (numberB >= numberC) {
                System.out.printf("%d, %d, %d", numberA, numberB, numberC);
            } else {
                System.out.printf("%d, %d, %d", numberA, numberC, numberB);
            }
        } else if (numberB >= numberA && numberB >= numberC) {
            if (numberA >= numberC) {
                System.out.printf("%d, %d, %d", numberB, numberA, numberC);
            } else {
                System.out.printf("%d, %d, %d", numberB, numberC, numberA);
            }
        } else {
            if (numberA >= numberB) {
                System.out.printf("%d, %d, %d", numberC, numberA, numberB);
            } else {
                System.out.printf("%d, %d, %d", numberC, numberB, numberA);
            }
        }
    }

    public static void problem6() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer A: ");
        int numberA = scanner.nextInt();

        System.out.print("Enter integer B: ");
        int numberB = scanner.nextInt();

        System.out.print("Enter integer C: ");
        int numberC = scanner.nextInt();

        int helper = numberA;
        numberA = numberB;
        numberB = numberC;
        numberC = helper;

        System.out.printf("Integer A now is: %d\n", numberA);
        System.out.printf("Integer B now is: %d\n", numberB);
        System.out.printf("Integer C now is: %d\n", numberC);
    }

    public static void problem7() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time: ");

        // btw this is never used...
        int time = scanner.nextInt();

        System.out.print("Enter amount of money: ");
        double cash = scanner.nextDouble();

        System.out.print("Am I healthy? ");
        boolean isHealthy = scanner.nextBoolean();

        if (isHealthy) {
            if (cash < 10) {
                System.out.println("Coffee time! Yohoo!");
            } else {
                System.out.println("Dinner time! Damn, I'm rich!");
            }
        } else {
            System.out.println("Covid time! Staying home!");
            if (cash > 0) {
                System.out.println("Drug shopping!");
            } else {
                System.out.println("Dr. Mangarov said - stay home, drink tea!");
            }
        }
    }
}
