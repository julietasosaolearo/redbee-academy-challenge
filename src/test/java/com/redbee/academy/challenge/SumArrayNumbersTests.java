package com.redbee.academy.challenge;

import java.util.Scanner;
import java.util.Arrays;
public class TwoArraySum {
  public static void main(String[] args) {

    
    Scanner scan = new Scanner(System.in);

    
    System.out.print("Enter numbers of first array: ");
    int array1size = scan.nextInt();
    System.out.print("Enter numbers of second array: ");
    int array2size = scan.nextInt();

    
    if(array1size != array2size) {
      System.out.println("Both array must have "+
                      "same number of elements");
      return; // stop 
    }

   
    int array1[] = new int[array1size];
    int array2[] = new int[array1size];
    int array3[] = new int[array1size];

    
    System.out.println("Enter first array: ");
    for (int i=0; i<array1.length; i++) {
      array1[i] = scan.nextInt();
    }
    
    System.out.println("Enter second array: ");
    for (int i=0; i<array2.length; i++) {
      array2[i] = scan.nextInt();
    }

    
    for (int i=0; i<array3.length; i++) {
      
      array3[i] = array1[i] + array2[i];
    }

    
    System.out.println("Resultant Array: " 
        + Arrays.toString(array3));
  }
}

