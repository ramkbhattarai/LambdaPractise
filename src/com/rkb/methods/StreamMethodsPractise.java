package com.rkb.methods;

import java.util.HashSet;
import java.util.Set;

import com.rkb.exercise.Person;

public class StreamMethodsPractise {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		set.add(new Person("ram", "shyam", 36));
		set.add(new Person("shiva", "seetal", 35));
		set.add(new Person("hari", "krishna", 34));
		set.add(new Person("santosh", "suman", 33));
		set.add(new Person("prem", "ramesh", 36));
		set.add(new Person("bhuvan", "needes", 36));
		set.add(new Person("dipesh", "sanjay", 36));
		
		boolean test = set.stream().allMatch(p -> p instanceof Person);
		boolean test1 = set.stream().anyMatch(p -> p.getFname().startsWith("r"));
		boolean test2 = set.stream().noneMatch(p -> p.getLname().startsWith("s"));
		System.out.println("______________________");
		System.out.println(test);
		long c = set.stream().filter(p ->test).count();
		System.out.println(c);
		set.stream().filter(p ->test).forEach(System.out::println);
		System.out.println("______________________");
		System.out.println(test1);
		long c1 = set.stream().filter(p ->test1).count();
		System.out.println(c1);
		set.stream().filter(p ->test1).forEach(System.out::println);
		System.out.println("______________________");
		long c2 = set.stream().filter(p ->test2).count();
		System.out.println(test2);
		System.out.println(c2);
		set.stream().filter(p ->test2).forEach(System.out::println);
	}	
}
