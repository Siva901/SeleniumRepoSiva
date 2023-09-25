package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {

		//Syntax : type[] name = {values};
		int[] mark = {45,56,78,34,22,89,98};
		
		//How to find Array length using length function
		 int length = mark.length;
		
		//print Last Value
		System.out.println(mark[length-1]);
		
		System.out.println("--------------------------------");
		
		
		//Ascending order sorting
		Arrays.sort(mark);
		
		for (int i = 0; i < mark.length; i++) {
			System.out.println(mark[i]);
		}
		//Descending order
		System.out.println("--------------------------------");
		for (int i =  mark.length-1; i >=0; i--) {
			System.out.println(mark[i]);
			
		}
		

	}

}
