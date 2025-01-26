/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questionthree;

/**
 *
 * @author HP
 */
public class QuestionThree {
     public static void main(String[]args){
        int[]data ={5,5,6,7,8,9,5,6,7,7};
        double mean=calculateMean(data);
        System.out.println("Mean: "+mean);
        
        double median =calculateMedian(data);
        System.out.println("Median: "+median);
        
        double stdDev =calculateStandardDeviation(data,mean);
        System.out.println("StandardDeviation: "+stdDev);
       
        
    
    }
    public static double calculateMean(int[]arr){
        double sum=0;
        for(int num:arr){
            sum+=num;
        }
        return sum/arr.length;
    }
    
    public static double calculateMedian(int[]arr){
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2==0){
            return(arr[n/2-1]+arr[n/2])/2.0;
        }else{
            return arr[n/2];
        }
    }
    
    public static  double calculateStandardDeviation(int[]arr,double mean){
       double sumSquaredDifferences=0;for(int num:arr){
           sumSquaredDifferences+=Math.pow(num - mean,2);  
       }
       return Math.sqrt(sumSquaredDifferences / arr.length);
    }
}
