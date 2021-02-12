package java8;

import java.util.Arrays;

public class UppercaseDemo {

	public static void main(String[] args) {
		
		String a[]= {"abc","def","jkl"};
		Arrays.stream(a).map(m->m.toUpperCase()).forEach(System.out::println);
	}

}
