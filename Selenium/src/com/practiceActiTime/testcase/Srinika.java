package com.practiceActiTime.testcase;

import java.util.Scanner;

public class Srinika {

	public static void main(String[] args) {
		
		int k=0,count=0;
		
		System.out.println("Enter how many characters");
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		String[] a =  new String[n];
		String[] b= new String[a.length];
		
		for(int i=0;i<a.length;i++) 
		{
			a[i]=s.next();
		}
		
		System.out.println("Enter the char you want to delete");
		String deleteElement=s.next();
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"=="+deleteElement);
			if(a[i]!=deleteElement)
			{
				b[k++]=a[i];
				
			}
			else
			{
				count++;
				continue;
			}
				
				//System.out.println(b[k++]);
		}
		System.out.println(count+"\n\n");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
