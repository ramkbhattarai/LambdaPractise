package com.rkb.methodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.rkb.exercise.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("ram", "ckrishna", 36),
				new Person("bam1", "bkrishna1", 136),
				new Person("cam2", "akrishna2", 236)
				);
		
		
		people.sort((p1,p2)-> p1.getLname().compareTo(p2.getLname()));
		System.out.println("using old style");
		people.forEach(p -> System.out.println(p));
		// here the lambda takes in a parameter and passes in to a function.
		// this println is a instance method so it is called with the instance of the class ie 
		// System is call System.out --> is instance of the class to which println is called
		System.out.println();
		System.out.println("using new style");
		people.forEach(System.out::println);

	}

}