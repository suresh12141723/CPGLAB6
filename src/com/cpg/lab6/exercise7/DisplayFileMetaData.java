package com.cpg.lab6.exercise7;

import java.io.File;
import java.util.Scanner;

public class DisplayFileMetaData {

	public static void main(String[] args) 
	{
		
     Scanner scan=new Scanner(System.in);
     getMetadata(scan.nextLine());
     scan.close();
	}
	
	public static void getMetadata(String path)
	{
		File file=new File(path);
		if(file.exists())
			System.out.println("File Exits !!");
		else 
			System.out.println("File does not exist!!");
		if(file.canRead())
			System.out.println("file is Readable!! ");
		else 
			System.out.println("File cannot be readable!!");
		if(file.canWrite())
			System.out.println("File can be Writable");
		else
			System.out.println("File is not writable!!");
		System.out.println("This file is of type:"+file.getName());
		System.out.println("File Size:"+file.length()+" bytes");
	}
}
