package com.cpg.lab6.exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SpaceSeperatedIntegerInStringUsingStringTokenizer 
{
   public int getSumOfIntegers()
   {
	   int sum=0;
	   try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))
		{
		   System.out.println("Enter Array of space seperated integer Array");
			String s1=br.readLine();
			StringTokenizer str=new StringTokenizer(s1," ");
			ArrayList<Integer> arr=new ArrayList<>(); 
			while(str.hasMoreTokens())
				 arr.add(Integer.parseInt(str.nextToken()));
		    for(int i:arr)
		    	 sum=sum+i;
		}catch(IOException e)
		{
			
		}
	   return sum;
   }
}
