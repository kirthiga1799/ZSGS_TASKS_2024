package com.tasks;

import java.util.Random;

public class RandomNumber_3 {
	 public static void main(String[] args) {
		 
	        Random random = new Random();
	        
	        int randomNumber = random.nextInt(-10); //the argument must be positive no negative values
	        System.out.println("Random number: " + randomNumber);
	    }

}
