package com.cpg.lab6.exercise5;

public class ModifiedNumberChangeNumberAccordingToDifferenceOfNumbers {

	public  int modifyNumber(String input)
	{
		int output=0;
		char arr[]=input.toCharArray();
		StringBuffer os=new StringBuffer();
		os.append(arr[arr.length-1]);
		for(int i=arr.length-1;i>0;i--)
		{
		 int temp=Math.abs((int)arr[i]-(int)arr[i-1]);
		 os.append(temp);
		}
		os.reverse();
		output=Integer.parseInt(os.toString());
		return output;
	}

}
