package com.rkb.collection;

import java.util.Arrays;
import java.util.List;

import com.rkb.exercise.Person;

public class StreamExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("ram", "ckrishna", 36),
				new Person("bam1", "bkrishna1", 136),
				new Person("cam2", "akrishna2", 236),
				new Person("cam2", "akrishna2", 236)
				);
		people.stream()
		.filter(p -> p.getFname().startsWith("r"))
		.forEach(System.out::println);
		 // Creating a list of integers 
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5); 
  
        System.out.println("The distinct elements are :"); 
  
        // Displaying the distinct elements in the list 
        // using Stream.distinct() method 
        list.stream().distinct().forEach(System.out::println);
        System.out.println("____________________");
        long c = list.stream().distinct().count();
        System.out.println(c);
        
		System.out.println("____________________");
		
		people.stream()
		.distinct()// doesn't work for objects use filter
		.forEach(System.out::println);
	long count = 	people.stream()
		.distinct() // doesn't work for objects
		.count();
	System.out.println(count);

	}

}
