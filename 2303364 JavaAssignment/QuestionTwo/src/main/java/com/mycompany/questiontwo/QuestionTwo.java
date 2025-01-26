/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questiontwo;

/**
 *
 * @author HP
 */
public class QuestionTwo {

    public static void main(String[] args) {
        System.out.println("American Flag using Single Loop:");
        FlagSingleLoop();

        System.out.println("\nAmerican Flag using Nested Loop:");
        FlagNestedLoop();
    }
    
      public static void FlagSingleLoop() {
        int rows = 6; 
        for (int i = 0; i < rows; i++) {
            if (i < 3) { 
                System.out.println("*******=========");
            } else { 
                System.out.println("================");
            }
        }
    }


    public static void FlagNestedLoop() {
        int rows = 6;
        int columns = 16;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i < 3 && j < 7) { 
                    System.out.print("*");
                } else if (i < 3 && j >= 7) {
                    System.out.print("=");
                } else { 
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }
}
