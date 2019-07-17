package com.example.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Task 1
        System.out.println("salary is 4, bonus - " + calculateSalary(4, true));
        System.out.println("salary is 4, no bonus - " + calculateSalary(4, false));
        System.out.println("salary is negative - " + calculateSalary(-1, true));

        System.out.println("====================================");

        // Task 2
        ArrayList<String> enteredStrings = createStringsArray();
        printStringsArray(enteredStrings);
    }

    private static int calculateSalary(int salary, boolean bonus){
        if (salary < 0) // checking against zero
            return -1;
        if (!bonus)
            return salary;
        else
            return salary * 10;
    }

    private static void printStringsArray (ArrayList<String> enteredStrings){
        for (int i = 0; i < enteredStrings.size(); i++){
            System.out.println(enteredStrings.get(enteredStrings.size() - i - 1));
        }
    }

    private static ArrayList<String> createStringsArray(){
        ArrayList<String> enteredStrings = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 5 strings");

        for (int i = 0; i < 5; i++){
            String enteredString = scanner.nextLine();
            enteredStrings.add(enteredString);
        }

        return enteredStrings;
    }
}
