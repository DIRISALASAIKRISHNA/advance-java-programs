package com.saikrishna.numbers;
import java.util.Scanner;


public class StongNumber {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number to check storng nuber or not");
		int n =s.nextInt();
		int temp=n;
		int sum=0;
		  while(n!=0)
		  {
			int digit = n%10;
			
			int fact=1;
			for(int i=1;i<=digit;i++)
			{ 
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		  }
		
		if(sum==temp)
		{
			System.out.println(temp+" is strong number");
		}
		else
		{
			System.out.println(temp+" is not strong number");
		}
		s.close();
		


	}

}
