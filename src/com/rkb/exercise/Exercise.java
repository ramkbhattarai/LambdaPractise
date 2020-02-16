package com.rkb.exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("ram", "ckrishna", 36),
				new Person("bam1", "bkrishna1", 136),
				new Person("cam2", "akrishna2", 236)
				);
		
		//step 1: sort list by last name
		// java 7 approach
	 people.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getLname().compareTo(o2.getLname());
			}
			
		});
	// step 2 print all the people using a method
		people.forEach(p -> System.out.println(p));
		
		// java 8 approach
		System.out.println("java 8 approach");
		people.sort((p1,p2)-> p1.getLname().compareTo(p2.getLname()));
		// step 2 print all the people using a method
		people.forEach(p -> System.out.println(p));
		
		
		
		// step 3: print all the people that last name begins with c
		// java 7 approach
		System.out.println("java 7 approach");
		for(Person p: people) {
			if(p.getLname().contains("c")) {
				System.out.println(p);
			}
		}
		
		System.out.println("java 8 approach");
		people.stream()
		.filter(p -> !p.getLname().contains("c")) // filters all if the statement is false
		.forEach(p -> System.out.println(p));

	}

}
