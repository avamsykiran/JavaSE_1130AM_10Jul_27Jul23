package com.cts.streamsapidemo;

import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

public class App1 {

	public static void main(String[] args) {
		Random random = new Random();
		Integer[] nums = new Integer[10];
		
		for(int i=0;i<10;i++) {
			nums[i] = random.nextInt(100);
		}
		
		Arrays.stream(nums).forEach(System.out::println);
		
		Optional<Integer> max = Arrays.stream(nums).reduce((n1,n2)->n1>n2?n1:n2);
		System.out.println("The max valeu is: "+max.get());
		
		Optional<Integer> avg = Arrays.stream(nums).reduce((n1,n2)->(n1+n2)/2);
		System.out.println("The average is: "+avg.get());

		Optional<Double> avg2 = Arrays.stream(nums).map(x -> (double)x).reduce((n1,n2)->(n1+n2)/2);
		System.out.println("The double average is: "+avg2.get());
		
		Optional<Double> sum = Arrays.stream(nums).map(x -> (double)x).reduce((n1,n2)->n1+n2);
		System.out.println("The actual average is: "+(sum.get()/nums.length));
		
		System.out.println("--------------------------------------------------------------");
		Arrays.stream(nums).filter(n -> n%2==0).forEach(System.out::println);
		System.out.println("--------------------------------------------------------------");
		Arrays.stream(nums).filter(n -> n%2==0).map(x->x*x).forEach(System.out::println);
		
	}

}
