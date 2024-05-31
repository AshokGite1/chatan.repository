package com.abhi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class EmployeeTest {
	
	//Create 3 instances of this Class and assign values.
	//Add these Objects to ArrayList	
	
	public static void main(String[] args) {
	
		
		List<Employee> emp =new ArrayList<Employee>();
		
		emp .add(new Employee(101, "Ashok", "Male", "12-12-2024", 50000.00));
		emp .add(new Employee(102, "Rohit", "Male", "13-12-2024", 50000.00));
		emp .add(new Employee(103, "Pooja", "FeMale", "14-12-2024", 50000.00));//150000
		
		/*
		 * //Add function computeTotalSalary with Employee List as input parameter to
		 * the function. In this function loop through Employees and calculate the total
		 * salary and return this value // Call the above function and print the
		 * returned value.
		 * 
		 * //Double collect =
		 * emp.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		 * 
		 * Double collect =
		 * computeTotalSalary.stream().collect(Collectors.averagingDouble(Employee::
		 * getSalary)); System.out.println(collect);
		 * 
		 * //DoubleSummaryStatistics collect2 =
		 * emp.stream().collect(Collectors.summingInt(Employee::getSalary));
		 * 
		 * DoubleSummaryStatistics collect2 = computeTotalSalary
		 * .stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		 * 
		 * 
		 * 
		 * System.out.println(collect2); Optional<Double> sum =
		 * computeTotalSalary.stream().map(e->e.getSalary()).reduce((a,b)->a+b);
		 * 
		 * System.out.println("Total salary of Employee  :"+sum.get());
		 * 
		 * Optional<Employee> max =
		 * computeTotalSalary.stream().max(Comparator.comparingDouble(Employee::
		 * getSalary)); System.out.println(max.get());
		 */
		
		/*
		 * DoubleStream sum2 = emp.stream().mapToDouble(Employee::getSalary);
		 * System.out.println("Total salary of Employee   :"+sum2);
		 */
		        //3 top salary
		        // 3 lost salry
				// i want sorted base on id
				// i want sorted base on name
				// i want sorted on salary
				// i want sorted on age
				// i want sorted in decending order
				// i want more than 3000 salary
				// i want avarge age
				// average salary
				// max Salary
		//Total Salary
		Optional<Double> sum  = emp.stream().map(m->m.getSalary()).reduce((a,b)->a+b);
		System.out.println("Employee  "+sum.get());
		//3 top salary
		 List<Employee> collect = emp.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(3).collect(Collectors.toList());
		System.out.println(collect);
		List<Employee> collect5 = emp.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(3)
				.collect(Collectors.toList());
		
		//// i want sorted base on name
		
		List<Employee> collect2 = emp.stream().sorted((e,e1)->e.getName()
				.compareTo(e1.getName())).collect(Collectors.toList());
		System.out.println(collect2);
		
		// i want sorted on salary
		
		List<Employee> collect3 = emp.stream().sorted((e,e1)->e.getSalary().compareTo(e1.getSalary())).collect(Collectors.toList());
		System.out.println(collect3);
		
		
		
		
	}

}
