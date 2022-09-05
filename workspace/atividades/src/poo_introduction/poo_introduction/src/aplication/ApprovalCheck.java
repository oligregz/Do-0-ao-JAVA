package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.StudentGrades;

public class ApprovalCheck {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		StudentGrades student = new StudentGrades();
		
		student.name = sc.nextLine();
		
		sc.close();
	}

}
