package com.cpg.lab6.exercise9;

import java.util.Scanner;
import java.util.*;
public class MainControllerForCountDifferenceOfDates {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      
		Scanner scan=new Scanner(System.in);
		CountDifferenceOfDates obj=new CountDifferenceOfDates();
		System.out.print("\nEnter Date in 23/05/1999 format");
		
		Date d=new Date(scan.nextLine());
		obj.printDifferenceOfDates(d);
		scan.close();
	 }

}
