/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questionone;

/**
 *
 * @author HP
 */
public class QuestionOne {

    public static void main(String[] args) {
      System.out.println("Nigerian Flag using Single Loop:");
        FlagSingleLoop();

        System.out.println("\nNigerian Flag using Nested Loop:");
        FlagNestedLoop();
    }

    public static void FlagSingleLoop(){
        int rows= 4;
        String FlagRow= "****====****";
        
        for (int i=0; i< rows; i++){
            System.out.println(FlagRow);
        }
    }
    
    public static void FlagNestedLoop(){
        int rows= 4;
        int columns= 12;
        
        for (int i=0; i< rows; i++){
            for ( int j=0; j< columns; j++){
                if (j<4){
                    System.out.print("*");
                }else if (j<8){
                    System.out.print("=");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
