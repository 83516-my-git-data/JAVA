package com.sunbeam;

import java.util.Objects;

public class Student implements Comparable<Student> {
	
	int rollNo;
	String name;
	double marks;
	
	public Student() {
		
	}

	public Student(int rollNo, String name, double marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [RollNo = " + rollNo + ", Name = " + name + ", Marks = " + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		int value = this.rollNo - o.rollNo;
		return value;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollNo == other.rollNo;
	}
	
}
