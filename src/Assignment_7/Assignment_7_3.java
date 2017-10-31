/**
 * 
 */
package Assignment_7;										// Package declared

/**
 * Write a program in java to show how the capacity is changing in StringBuffer or in StringBuilder if we append the string. 
 * Hint:-The capacity changes according to the formula = Initial_capacity*2+2.
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */

public class Assignment_7_3 {								 // Class declared
	public static void main(String args[]){  				 // Main method started
		System.out.println("\nCapacity is changing in StringBuffer or in StringBuilder if we append the string :- \n");  // print statement
		StringBuilder myString =new StringBuilder();  		 // new object is created  
  		System.out.println(myString.capacity());  			 // output: 16 (since empty constructor reserves space for 16 characters)
  		myString.append("yeah");  							 // append() method will concatenate the string representation of any type of data to the end of the invoking StringBuffer object.
  		System.out.println(myString.capacity());			 // output: 16 (since empty constructor reserves space for 16 characters)
  		myString.append("java is complex language");  		 // append() method will concatenate the string representation of any type of data to the end of the invoking StringBuffer object.
  		System.out.println(myString.capacity());			 // now (16*2)+2=34  i.e. Initial_capacity*2+2 
  		myString.ensureCapacity(10);						 // now no change  
  		System.out.println(myString.capacity());             // now 34  
  		myString.ensureCapacity(50);                         // now (34*2)+2  
  		System.out.println(myString.capacity());             // now 70  
	}  													 	 // Main method ended
} 															 // 