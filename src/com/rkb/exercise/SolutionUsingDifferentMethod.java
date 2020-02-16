package com.rkb.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SolutionUsingDifferentMethod {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("ram", "ckrishna", 36),
				new Person("bam1", "bkrishna1", 136),
				new Person("cam2", "akrishna2", 236)
				);
		
		Collections.sort(people,(p1, p2) -> p1.getLname().compareTo(p2.getLname()));
		System.out.println("Printing all");
		performAsPerCondition(people, p -> true, p-> System.out.println(p));
		
		System.out.println("printing condintion one");
		performAsPerCondition(people, p -> p.getLname().startsWith("c"), p-> System.out.println(p.getFname()));
		System.out.println("printing condintion two");
		performAsPerCondition(people, p -> p.getFname().startsWith("c"), p-> System.out.println(p.getLname()));

	}

	private static void performAsPerCondition(List<Person> people, Predicate<Person> predicate, Consumer<Person> c) {
		
		for(Person p: people) {
			if(predicate.test(p)) {
				c.accept(p);
			}
		}
	}

}
