package week1.Day1.classroom;

import org.jsoup.select.Evaluator.IsFirstOfType;

public class FibonacciSeries {
	
	/*What are my learnings from this code? 
	1)  I Learned what is fibonacci series
    2)  Learned how to write for loop logic
    3)  learned how to apply assignments operator */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * The Fibonacci series is a series where the next term is the sum of the
		 * previous two terms. The first two terms of the Fibonacci sequence are 0
		 * followed by 1.
		 */
// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		
		int count = 8;
		int firstTerm = 0;
		int secondTerm = 1;
		int sum = 0;
		
		// Print first number
		
		System.out.println("Fibonacci serbies upto: " + count);
		
		// Iterate from 1 to the range
		
		for(int i=0; i<count; i++)
		{
			// print sum
			System.out.print(firstTerm + "," );	
			// add first and second number assign to sum

			// Assign second number to the first number

			// Assign sum to the second number
			
		    sum = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = sum;
								
		}
		

	}

}
