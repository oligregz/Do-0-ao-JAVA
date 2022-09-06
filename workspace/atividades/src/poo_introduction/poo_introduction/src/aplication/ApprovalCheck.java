package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.StudentGrades;

public class ApprovalCheck {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		StudentGrades student = new StudentGrades();
		
		System.out.println("Digite o nome do aluno:");
		student.name = sc.nextLine();
		
		System.out.println("ATENCAO - O primeiro trimestre totaliza 30 pontos enquanto o sengundo e terceiro 35.");
		
		System.out.println("Digite a nota do primeiro trimestre:");
		student.first_quarter_grades = sc.nextDouble();
		System.out.println("Digite a nota do segundo trimestre:");
		student.second_quarter_grades = sc.nextDouble();
		System.out.println("Digite a nota do terceiro trimestre:");
		student.third_quarter_grades = sc.nextDouble();
		
		if (student.first_quarter_grades > 30) {
			System.out.println("O primeiro trimestre nao pode conter mais que 30 pontos :(");
			return;
		}
		else if (student.second_quarter_grades > 35) {
			System.out.println("O segundo trimestre nao pode conter mais que 35 pontos :(");
			return;
		} else if (student.third_quarter_grades > 35) {
			System.out.println("O terceiro trimestre nao pode conter mais que 35 pontos :(");
			return;
		}
		
		double total = student.sumGrades();
		
		if (total < 60) {
			System.out.printf("Nota final: %.2f%n", total);
			System.out.println("Reprovado(a)");
			System.out.printf("Faltaram %.2f pontos", 60 - total);
		}
		else {
			System.out.printf("Nota final: %.2f%n", total);
			System.out.printf("Aprovado(a)");
		}
		sc.close();
	}

}
