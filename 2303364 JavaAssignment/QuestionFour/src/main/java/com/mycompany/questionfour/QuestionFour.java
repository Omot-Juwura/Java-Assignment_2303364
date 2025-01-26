/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questionfour;

/**
 *
 * @author HP
 */

import java.util.Scanner;

public class QuestionFour {

    public static void main(String[]args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number for index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("You entered:");
        for (int value : array) { 
            System.out.print(value + " ");
             }
        System.out.println();
    }
}
