package unicodeCalc;

import java.util.Arrays;
import java.util.Scanner;

public class Unicoder {
   public static void main(String[] args) {
   Scanner scnr = new Scanner(System.in);
 
   	String bigInput = "big";
   	String catInput = "cat";
   
	System.out.println(Arrays.toString("big".getBytes()));
	
  	System.out.println(Arrays.toString("cats".getBytes()));
  		
  	int bigSum = 0;
  	int catsSum = 0;
  	
  	for (int i : bigInput.getBytes()) {
  		bigSum += i;
  	}
  	System.out.println("The unicode sum for my first word, big, is " + bigSum);
  	
  	for (int i : catInput.getBytes()) {
  		catsSum += i;
  	}  	
  	System.out.println("The unicode sum for my second word, cats, is " + catsSum);
   
  	System.out.println("The unicode difference is: " + (catsSum - bigSum));
   }
}

      


    