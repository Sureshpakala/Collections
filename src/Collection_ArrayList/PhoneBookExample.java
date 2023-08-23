package Collection_ArrayList;

import java.util.*;
public class PhoneBookExample {
	public static void main(String[] args) {
		Map<String,Long> phoneBook=new HashMap<>();
		phoneBook.put("suresh", 9848399547l);
		phoneBook.put("ramesh", 8848359547l);
		phoneBook.put("naresh", 7848365547l);
		phoneBook.put("mahesh", 6348329547l);
		//Keys are Printing;
		for(String k:phoneBook.keySet()) {
			if(k.startsWith("m")) {
				System.out.println(phoneBook.get(k));
			}
			
		}
		//Using forEachLambda 
		phoneBook.forEach((x,y)-> System.out.println(x+" "+y));
		
		//Values are Printing;
//		for(Long v:phoneBook.values()) {
//			System.out.println(v);
//		}
//		//values are Printing;
//		for(String s:phoneBook.keySet()) {
//			System.out.println(phoneBook.get(s));
//		}
	}
}
