package com.test.myprograms;

public class MaxProfit {
	
	public int findMaxProfit(int[] S) {
		int minimum = Integer.MAX_VALUE;
		int currentProfit = 0;
		for(int i : S) {
			if(i < minimum) {
				minimum = i;
			}
			if(i - minimum > currentProfit) {
				currentProfit = i - minimum;
			}	
			
		}
		return currentProfit;
		
		
		
		
	}

}
