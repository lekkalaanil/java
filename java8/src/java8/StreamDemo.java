package java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		
		int[] arr= {10,20,80,9,8,4,6,7,8,4};
		
		//Arrays.stream(arr).sorted().distinct().forEach(System.out::println);
		int arr1[]=Arrays.stream(arr).map(m->m*2).sorted().distinct().toArray();
		Arrays.stream(arr1).forEach(System.out::println);
		
		
		
		int arr2[]=Arrays.stream(arr).sorted().distinct().toArray();
		System.out.println(arr2[1]);
		
		List<String> list=new CopyOnWriteArrayList<>(Arrays.asList("abc","def","jkl","mno","pqr"));
		
		List<String> l2= list
				.stream()
				.filter(s->s.startsWith("a"))
				.map(s->s.toUpperCase())
				.collect(Collectors.toList());
		
		
		l2.
		stream()
		.forEach(System.out::println);
		
		list
		.stream().sorted()
		.forEach(System.out::println);
		
		
	}
}