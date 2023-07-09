package com.numbermultiplier;
import java.util.Scanner;

public class NumberMultiplier {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  
  System.out.println("enter a number: ");
  int num = in.nextInt();
  
  System.out.println("enter a multiplier lowest than 10: ");
  int mul = in.nextInt();
  
  while(mul <= 10){
    System.out.printf("%d X %d = %d \n",num,mul,num*mul);
    mul++;
    in.close();
  }
   
  }
}
