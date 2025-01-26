/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questionfive;

/**
 *
 * @author HP
 */

import java.util.Scanner;
public class QuestionFive {

    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter values for a 10x10 matrix:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) { 
                System.out.print("Enter value for element at index [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("\nThe values entered in the 10x10 matrix are:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println(); 
        }
        input.close();
    }
    
}
