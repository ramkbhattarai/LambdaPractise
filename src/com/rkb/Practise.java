package com.rkb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Practise {

	public static void main(String[] args) {
		Stream<String> emptyStream = Stream.empty(); // creates empty stream
		System.out.println(emptyStream.toArray().length);
		
		
		Stream<String> stream = Stream.of("a", "b", "c");
		List<String> list = stream.map((ele)-> ele+" lets leave at 4 david")
		.filter((ele)-> {  
		ele.contains("a");
		System.out.println(ele.contains("a"));
		return !ele.contains("b");
		})
		.collect(Collectors.toList());
		
		list.forEach(ele -> System.out.println(ele));
		
		 List<Employee> employeeList = new ArrayList<>(Arrays.asList(
                 new Employee(1, "A", 100),
                 new Employee(2, "A", 200),
                 new Employee(3, "B", 300),
                 new Employee(4, "B", 400),
                 new Employee(5, "C", 500),
                 new Employee(6, "C", 600)));

		 Map<Integer, Employee> employeesMap = employeeList.stream()
                     .collect( Collectors.toMap(Employee::getId, 
                             Function.identity()) );

		 System.out.println(employeesMap);
		 
		 Foo newFun = () -> System.out.println("HI this is test");
		 newFun.greet();

	}
	


}
