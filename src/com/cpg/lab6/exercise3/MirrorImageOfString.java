package com.cpg.lab6.exercise3;

public class MirrorImageOfString {

	public String getImage(String input) 
	{
		StringBuffer interm=new StringBuffer();
		  interm.append(input);
		  interm.reverse();
		  StringBuffer output=new StringBuffer();
		      output.append(input+"|"+interm);
		  
		  return output.toString();
	}

}
