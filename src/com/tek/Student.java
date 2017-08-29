package com.tek;

public class Student {
	String name;
	int rollno;
	Student(String name,int rollno)
	{
		this.name= name;
		this.rollno= rollno;
	}
	public static void main(String[] args) {
		Student s1 = new Student("akhila",67);
		Student s2 = new Student("akarsha",87);
		System.out.println(s1);
		System.out.println(s2);
	}

}
