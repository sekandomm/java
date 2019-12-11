package chapter4;

public class Athlete {
	private String sport;
	private Student student;
	
	public Athlete() {
		sport="Lax";
		student = new Student();
	}
	public Athlete(String sport, String name, int grade, int id, double gpa, String major) {
	      this.sport = sport;
	      student = new Student(name, grade, id, gpa, major);
	}
	public String getSport() {return sport;}
	public Student getStudent() {return student;}
}
