package com.week1.Day1.classroom;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Prime numbers are natural numbers that are divisible by only 1 and the number itself.

		int primeNumber = 13;
		boolean flag = false;
		
		for(int i=2; i<=primeNumber/2; ++i)
		{
			if(primeNumber%i==0)
			{
				flag = true;
				break;
			}
		}
		
		if(!flag)
			System.out.println("This is a prime number : " + primeNumber);
		else
			System.out.println("This is not a prime number " + primeNumber);
				
	}

}
