package com.rkb.collection;

import java.util.Arrays;
import java.util.List;

import com.rkb.exercise.Person;

public class CollectionIterationExample {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("ram", "ckrishna", 36),
				new Person("bam1", "bkrishna1", 136),
				new Person("cam2", "akrishna2", 236)
				);
		System.out.println("basic for loop also called external iteration");
		for(int i = 0; i< people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		System.out.println("enhanced for loop also called external iteration");
		for(Person p:  people) {
			System.out.println(p);
		}
		
		System.out.println("for-each loop also called internal iteration");
		people.forEach(System.out::println);
	}

}
