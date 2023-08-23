package Collection_ArrayList;

import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(25);
		nums.add(65);
		nums.add(85);
		nums.add(75);
		nums.add(34);
		for(int i=0; i<nums.size(); i++) {
			nums.set(2,32);
			//nums.remove(1);
			System.out.print(nums.get(i)+" ");
		}
		System.out.println();
		
		for(Integer v:nums) {
			System.out.print(v+" ");
		}
	}
}
