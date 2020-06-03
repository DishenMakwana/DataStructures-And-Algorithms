package list;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList<>();
		
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("sss");
		fruits.add("apple");
		//fruits.add(2, "o");
		//System.out.println(fruits);
		fruits.set(2, "banana");
		System.out.println(fruits.size());
		System.out.println(fruits.contains("Guvava"));
		System.out.println(fruits.isEmpty());
		String[] str=new String[fruits.size()];
		fruits.toArray(str);
		for(String s:str)
		{
			System.out.println(s);
		}
		System.out.println(fruits);
		List<String> toRemove=new ArrayList<>();
		toRemove.add("apple");
		fruits.removeAll(toRemove);
		System.out.println(fruits);
		fruits.remove(1);
		System.out.println(fruits);
		fruits.clear();
		System.out.println(fruits);
		
//		ArrayList<Integer> marks=new ArrayList<>();
//		
//		marks.add(96);
//		marks.add(55);
//		Pair<String,Integer> p1=new Pair("darshan",99);
//		Pair<String,Integer> p2=new Pair("darshan",99);
//		p1.getDesc();
//		p2.getDesc();
		
	}

}
