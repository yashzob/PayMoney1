/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.greatlearning.service.denomination;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Denomination {

    public static void main(String[] args) {
        //Enter the Size of transaction array by User
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of transaction array");
        int size = sc.nextInt();
        int[] transactionArray = new int[size];

        //amount of transaction by user
        int i = 0;
        for (i = 0; i < size; i++) {
            transactionArray[i] = sc.nextInt();

        }
       
        int TransactionNum = 0, target = 0;

        //target given by user
        System.out.println("Enter the Value of Target Value");
        target = sc.nextInt();
        
        
        //
        System.out.println("Enter the total no. of target that needs to be achived ");
        int targetSize = sc.nextInt();
        
        for (i = 0; i < targetSize; i++) {
            target= target - transactionArray[i];
                  
            if (target <=0)
            {
                System.out.println("Target achived "+(i+1) );
                break;
            }
           
            if ( target > 0 && i == targetSize -1) {
                System.out.println("Given Target is not achived ");
            } 
            
            
            
        }
    }
}
