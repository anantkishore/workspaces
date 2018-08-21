/**
 * 
 */
package com.kishore.anant;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author i351596
 *
 */
public class Student implements Comparable<Student>{
	
	String name;
	int id;
	
	

	/**
	 * 
	 */
	public Student(String name, int id ) {
		this.name = name;
		this.id = id;
	}
	
	@Override
	public int hashCode()
	{
		return 1;
	}
	
	@Override
	public boolean equals(Object s)
	{
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student s1 = new Student("anant",1);
		Student s2 = new Student("anant",1);
		
		Set<Student> treeSet = new TreeSet<>();
		
		treeSet.add(s1);
		treeSet.add(s2);
		
		System.out.println(treeSet.toString());
		
		Set<Student> hashSet = new HashSet<>();
		
		hashSet.add(s1);
		hashSet.add(s2);
		
		System.out.println(hashSet.toString());
	}

	@Override
	public int compareTo(Student o) {
		
		return 1;
	}

}
