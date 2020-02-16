package com.rkb.methods;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.rkb.exercise.Person;

public class StreamFlatMapAndMap {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("ram", "ckrishna", 36),
				new Person("bam1", "bkrishna1", 136),
				new Person("cam2", "akrishna2", 236)
				);
		
		List<Person> people2 = Arrays.asList(
				new Person("cram", "ckrishna", 306),
				new Person("bcam1", "bckrishna1", 136),
				new Person("ccam2", "ackrishna2", 236)
				);
		
		List<Employee> emp = Arrays.asList(
				new Employee(1,"hari",people),
				new Employee(2, "nayaray", people2)
				);
		
		people.stream().map(p-> p.getFname()).forEach(System.out::println);
		System.out.println("------------------");
		emp.stream().flatMap(e -> e.getFriends().stream()).forEach(System.out::println);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Humility");
		map.put(2, "Human");
		map.put(3, "Humiliation");
		map.put(4, "Humanity");
		
	 Map<Integer, String> collect = map.entrySet().stream()
				 .filter(m -> m.getKey() != 3)
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		 
		 System.out.println(collect);
		 
//		 Map<Integer, String> HOSTING = new HashMap<>();
//	        HOSTING.put(1, "linode.com");
//	        HOSTING.put(2, "heroku.com");
//	        HOSTING.put(3, "digitalocean.com");
//	        HOSTING.put(4, "aws.amazon.com");
//
//	        //Map -> Stream -> Filter -> Map
//	        Map<Integer, String> collect1 = HOSTING.entrySet().stream()
//	                .filter(map1 -> map1.getKey() == 2)
//	                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
//
//	        System.out.println(collect1); //output : {2=heroku.com}
//
//	        Map<Integer, String> collect2 = HOSTING.entrySet().stream()
//	                .filter(map2 -> map2.getKey() <= 3)
//	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//
//	        System.out.println(collect2); //output : {1=linode.com, 2=heroku.com, 3=digitalocean.com}

	}

}
