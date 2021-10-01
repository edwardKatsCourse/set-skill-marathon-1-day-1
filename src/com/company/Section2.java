package com.company;

import java.util.Scanner;

public class Section2 {

    public static void main(String[] args) {
        //System.out.println("Введите имя: ");
        //String name = new Scanner(System.in).nextLine();

        //System.out.println("Вы ввели: " + name);

        /**
         * - Напечатать: «Введите ваше имя»
         * - Считать ввод в firstName
         *
         * - Напечатать: «Введите вашу фамилию»
         * - Считать ввод в lastName
         *
         * - «склеить» имя и фамилию в fullName
         * - Напечатать: «Привет fullName, я твоя программа на Джава»
         */

//        System.out.println("Name: ");
//        String name = new Scanner(System.in).nextLine();
//
//        System.out.println("last name: ");
//        String lastname = new Scanner(System.in).nextLine();
//
//        String fullName = name + " " + lastname;
//        System.out.println("Hello " + fullName + ", I am your Java program");
//
        System.out.println("Enter age: ");
        int age = new Scanner(System.in).nextInt();

        System.out.println(age);

        /**
         * Считать с консоли месячную зарплату monthlySalary
         * Объявить и высчитать
         *      yearlySalary
         *      weeklySalary
         * Вывести на консоль
         *      «Месячная зарплата: monthlySalary»
         *      «Годичная зарплата: yearlySalary»
         *      «Недельная зарплата: weeklySalary»
         */


        System.out.println("ЗП");
        int monthly = new Scanner(System.in).nextInt();

        int yearly = monthly * 12;
        int weekly = yearly / 52;


        System.out.println("Monthly: " + monthly);
        System.out.println("Yearly: " + yearly);
        System.out.println("Weekly: " + weekly);





    }
}
