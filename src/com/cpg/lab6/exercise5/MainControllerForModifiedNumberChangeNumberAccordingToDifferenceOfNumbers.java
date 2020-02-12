package com.cpg.lab6.exercise5;

import java.util.Scanner;

public class MainControllerForModifiedNumberChangeNumberAccordingToDifferenceOfNumbers {

	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		  ModifiedNumberChangeNumberAccordingToDifferenceOfNumbers obj=new ModifiedNumberChangeNumberAccordingToDifferenceOfNumbers();
		  System.out.println("Enter Number:");
		  String input=scan.nextLine();
		  System.out.println(obj.modifyNumber(input));
		     scan.close();

	}

}
