package com.cpg.lab6.exercise9;

import java.util.*;
public class CountDifferenceOfDates {

	public void printDifferenceOfDates(Date date)
	{
		Date currentdate=new Date();
		System.out.println("Duration in Days:"+Math.abs(currentdate.getDate()-date.getDate()));
		System.out.println("Duration in months:"+Math.abs(currentdate.getMonth()-date.getMonth()));
		System.out.println("Duration in years:"+Math.abs(currentdate.getYear()-date.getYear()));
	}
}
