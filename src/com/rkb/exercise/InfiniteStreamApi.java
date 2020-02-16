package com.rkb.exercise;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStreamApi {

	public static void main(String[] args) {
		Stream<Integer> numbers = Stream.iterate(0, i->i+1);
	List<Integer> num = numbers.limit(10).collect(Collectors.toList());
	num.forEach(System.out::print);

	}
	

}
