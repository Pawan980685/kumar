package com.nt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
	
 
		/*
		 * List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5); Integer sum =
		 * integers.stream() .reduce(0, Integer::sum); //System.out.println(sum);
		 * 
		 * long sum2 =
		 * integers.stream().collect(Collectors.summarizingInt(Integer::intValue)).
		 * getMin(); System.out.println(sum2);
		 */

		Employee emp1=new Employee("pawan", 10000.0, "Software Eng");
		Employee emp2=new Employee("kumar", 2200.0, "Engineering");
		Employee emp3=new Employee("pankaj", 400.0, "Frontend Developer");
		
		//.map(String::toUpperCase)
       // .collect(Collectors.toList());
		List<Employee> employee=Arrays.asList(emp1,emp2,emp3);
		 List<String> collect = employee.stream().map(Employee::getName)
		 .map(String::toUpperCase)
				.filter(ename->ename.equalsIgnoreCase("pankaj"))
				.collect(Collectors.toList());
		//System.out.println(collect);
		
		Double double1 = employee.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(1).findAny().get();
		//System.out.println(double1);
		List<String> collect2 = employee.stream().map(e->e.getDept()).sorted(Comparator.comparingInt(String::length))
		.collect(Collectors.toList());
		System.out.println(collect2);
}
}