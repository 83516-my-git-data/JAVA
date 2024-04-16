package com.sunbeam;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		List<Student> studList = new ArrayList<>();
		studList.add(new Student(10, "Aanand  ", 78));
		studList.add(new Student(17, "Ganesh  ", 80));
		studList.add(new Student(15, "Shantanu", 83));
		studList.add(new Student(13, "Aniket  ", 74));
		studList.add(new Student(20, "Shubham ", 79));

		System.out.println("Before sort : ");
		for (Student stud : studList)
			System.out.println(stud);
		

		System.out.println();
		System.out.println("After Natural sorting : ");
		Collections.sort(studList);
		for (Student stud : studList)
			System.out.println(stud);

		System.out.println("Sorting on student name : ");

		class CompareName implements Comparator<Student> {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}
		}

		Comparator<Student> compareName = new CompareName();
		Collections.sort(studList, compareName);

		for (Student stud : studList)
			System.out.println(stud);

		int roll;
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.print("Enter rollNo : ");
		roll = sc.nextInt();
		s.rollNo = roll;
		
		if(studList.contains(s))
			System.out.println("Student exists");
		else
			System.out.println("Student not found");
		
	}
}