package entities;

public class StudentGrades {
	public String name;
	public double first_quarter_grades;
	public double second_quarter_grades;
	public double third_quarter_grades;
	
	public double sumGrades() {
		return first_quarter_grades
				+ second_quarter_grades
				+ third_quarter_grades;
	}
}
