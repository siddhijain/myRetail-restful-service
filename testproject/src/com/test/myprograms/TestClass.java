package com.test.myprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.test.myprograms.model.Employee;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Removing duplicates from List
		List<Employee> li = new ArrayList<>();
		li.add(new Employee(1,"Siddhi"));
		li.add(new Employee(9,"Name"));
		li.add(new Employee(1,"Ankit"));
		li.add(new Employee(2,"test"));
		li.add(new Employee(3,"test123"));
		
		Set<Employee> s = new HashSet<>();
		s.addAll(li);
		
	/**	Collections.sort(li,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				if(o1.getEmployeeId()>o2.getEmployeeId()) return -1;
				else if(o1.getEmployeeId()<o2.getEmployeeId()) return 1;
				return 0;
			}
			
			
		}); */
		
		for(Employee e : s) {
			System.out.println(e);
		}
		
		//Two empty strings are equal
		String str = "";
		String str1 = "";
		System.out.println(str1==str); //returns true
		
		//Find maximum profit
		MaxProfit profit = new MaxProfit();
		int[] array = {109,2,1,3,1,1};
		System.out.println(profit.findMaxProfit(array));
	}

}
