package com.myexample;

import java.util.Scanner;

public class StudentMain {

	static Student stuArray[] = new Student[15];
	static StudentMain sMain = new StudentMain();
	static int index = 0;

	Scanner sc = new Scanner(System.in);
	String name;
	int id, rollNo;

	public void addStudent() {
		System.out.println("Provide name of student :");
		name = sc.next();
		System.out.println("Provide id of student :");
		id = sc.nextInt();
		System.out.println("Provide rollNo of student :");
		rollNo = sc.nextInt();

		Student stuInput = new Student(id, name, rollNo);

		if (!sMain.checkStudentRecord(stuInput)) {
			stuArray[index] = stuInput;
			index++;
		} else {
			System.out.println("Student Record already exist");
		}
	}

	public boolean checkStudentRecord(Student stuInput) {

		boolean b = false;
		for (Student s : stuArray) {
			if (s != null) {
				if (s.equals(stuInput)) {
					b = true;
					break;
				}

			}

		}
		return b;
	}
	public void dispaly() {

		for (Student s : stuArray) {
			if (s != null) {
				System.out.println(s);
			}

		}
		System.out.println();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean access = true;

		do {
			System.out.println("1. add student \n2. display all student \n3. exit");
			System.out.println("Select choices :");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				sMain.addStudent();
				break;

			case 2:
				sMain.dispaly();
				break;

			case 3:
				access = false;
				break;

			}

		} while (access);

	}

}