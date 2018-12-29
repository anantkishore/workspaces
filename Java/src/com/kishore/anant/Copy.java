package com.kishore.anant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.SortingFocusTraversalPolicy;

public class Copy {

	public Copy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		Sortlist(list);
		
		
		
	}
	
	public static void Sortlist(List<String> list)
	{
		
		String[] arr = new String[list.size()];
		
		list.toArray(arr);
		
		Arrays.sort(arr);
		
		list.clear();
		
		
		
	}

}
