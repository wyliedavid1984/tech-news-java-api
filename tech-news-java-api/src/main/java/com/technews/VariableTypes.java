package com.technews;

public class VariableTypes {
        public static void  main (String[] args) {
            String name = "Cleopatra";
            int age = 2016 + 69;
            double price = 199.99;
            boolean truth = true;
            boolean falseness = !truth;
            System.out.println(age);
            System.out.println(falseness);
            double sum = age + price;
            String concat = name + age;
            System.out.println(sum);
            System.out.println(concat);
        }
}
