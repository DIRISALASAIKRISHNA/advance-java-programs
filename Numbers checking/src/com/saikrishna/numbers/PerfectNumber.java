package com.saikrishna.numbers;
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number to check perfect or not");
	    int	n=s.nextInt();
	    int sum=0;
		for(int i=1;i<=n/2; i++)
		{
			if(n%i==0)
			{
			 sum = sum+i; 
			}
			
		}
		if(sum==n)
		{
			System.out.println(n+"is perfect number");
		}
		else
		{
			System.out.println(n+"is not perfect number");
		}
		s.close();
		
	}

}
