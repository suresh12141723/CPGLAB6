package com.cpg.lab6.exercise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadLinesFromFile {

	public static void main(String[] args)
	{
	  
     display();
	}
	
	public static void display()
	{
		File f=new File("A://cap train//reading material//Core java 8//samplefile.txt");
		
	      try(Scanner scan=new Scanner(f))
	      {
	    	  int i=1;
	    	 while(scan.hasNext())
	    	  System.out.println(i+++"-->"+scan.nextLine());
	      }
	      catch(FileNotFoundException e)
	      {
	    	 System.out.println("File name does not exist!!"); 
	      }
	}
}
