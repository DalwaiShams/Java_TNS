package com.shams.javassignments.assignmentnine;

import java.util.Scanner;
public class Quiz {
	public static int rounds()
	{
		Scanner sc = new Scanner(System.in);
		int round =1;
		int totalSample=0;
		int collectedSample = 0;
		while(totalSample<30)
		{
			System.out.println("Enter the Number of Samples collected in round "+(round));
			collectedSample = sc.nextInt();
			round++;
			totalSample+=collectedSample;
			
		}
		System.out.println("No of leaf samples collected "+totalSample);
		sc.close();
		return round;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Asif is Returning home after "+rounds()+" rounds");
	}


}


