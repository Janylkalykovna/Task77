package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        newMethod();
        newMethod2();
        newMethod3();
    }

    public static void newMethod() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int counter = 0;
        for (int i = 1; i < 10; i++) {
            counter = i + 2;
            System.out.println(i + "+" + "2" + "=" + counter);
        }
    }
    public static void newMethod2() {
        System.out.println("konsoldon bir jakwy korgon tamagyndy jaz");
        Scanner scan1 = new Scanner(System.in);
        String tamak = scan1.nextLine();

        switch (tamak) {
            case "alma":
                System.out.println(70);
                break;
            case "kurut":
                System.out.println(150);
                break;
            case "sahar":
                System.out.println(80);
                break;
            case "shokolad":
                System.out.println(225);
                break;
            case "sandwich":
                System.out.println(65);
                break;
            case "suu":
                System.out.println(25);
                break;
            default:
                System.out.println("Mynday tamak jok");
        }
    }
    public static void newMethod3() {
        System.out.println("Eki san beriniz");
        Scanner scan2 = new Scanner(System.in);
        int h = scan2.nextInt();
        int b = scan2.nextInt();
        String c = (h > b) ? "En chon san" + h : "En chon san: " + b;
        System.out.println(c);


    }
}