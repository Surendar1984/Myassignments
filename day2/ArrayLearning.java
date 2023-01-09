package week1.day2;

import java.util.Arrays;

public class ArrayLearning {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int marks[] = {30,50,98,56,78};
//	//or** int [] marks = {30,50,98,56,78};
//	String [] name = {"Sam","Rajesh","Ramesh","Suresh"};
//	//storing array lenth to variable** int = length = marks.length;
//		int length = marks.length;
//	//shortut to select variable** Ctrl + 2, L 	
//		for (int i = 0; i < 4; i++) {
//			System.out.println(name[i]);
//			System.out.println(marks[i]);	
		int[] nums = {22, 55, 36, 96, 41, 57};
		int length = nums.length; 
		Arrays.sort(nums);
		
		System.out.println(nums[0]);
		System.out.println(nums[length-1]);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(i);
		} 
		
		}
}
