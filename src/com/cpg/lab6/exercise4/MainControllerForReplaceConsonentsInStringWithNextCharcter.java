package com.cpg.lab6.exercise4;

import java.util.Scanner;

public class MainControllerForReplaceConsonentsInStringWithNextCharcter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String:");
		String input=scan.nextLine();
		ReplaceConsonentsInStringWithNextCharcter obj=new ReplaceConsonentsInStringWithNextCharcter();
		System.out.println(obj.alterString(input));
		 scan.close();
	}

}
