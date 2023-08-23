package Collection_ArrayList;

import java.util.ArrayList;

public class Numbers {
	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(25);
		nums.add(45);
		nums.add(22);
		nums.add(37);
		nums.add(98);
		nums.add(64);
		for(int i=0; i<nums.size(); i++) {
			if(nums.get(i)%2==0)
			{
				System.out.println(nums.get(i)+" is Even Number");
			}
			else {
				System.out.println(nums.get(i)+" is Odd Number");
			}
		}
		
		System.out.println();
		int k=nums.get(0);
		for(int i=0; i<nums.size(); i++)
		{
			if(nums.get(i)>k) {
				k=nums.get(i);
			}
		}
		System.out.println(k);
	}

}
