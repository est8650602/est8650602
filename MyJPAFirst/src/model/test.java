package model;

import java.util.*;
import java.util.function.Predicate;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> data = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		Predicate<Integer> pd = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {		       
		             return t%2==0;
			}
		};
		//data.removeIf(pd);
		System.out.println(data);
		data.removeIf(t -> t%2 !=0 );
		System.out.println(data);
		
		
	}
}

