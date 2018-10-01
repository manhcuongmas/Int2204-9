/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan4;

/**
 *
 * @author CCNE
 */
public class Tuan4 {

       public static  int max2so(int a, int b)
       {
           if(a > b) return a;
           return b;
       
       }
       public static int smallarray(int[] arr)
       {
           int min = arr[0];
           for(int i = 0; i < arr.length; i++)
           {
               if (min > arr[i]) {
                   min = arr[i];
               }
           
           }
       
           return min;
       }
       public static String BMI(double height, double weight){
        double bmi = (double) (weight) / (height * height);
           if(bmi > 18.5) return "Thieu can";
           else if (bmi > 18.5 && bmi < 24.99) return "Binh thuong";
           else if(bmi > 23 && bmi < 24.99) return "Thua can";
           else  return "Beo phi";
           
          }
    
    
}
