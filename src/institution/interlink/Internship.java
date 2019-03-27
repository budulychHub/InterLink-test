package institution.interlink;

import person.Student;

public class Internship {
	
    private String name;
	private Student student;

	public Internship(String name) {
    	this.name = name;
    }

    public void setStudent(Student student) {
    	this.student = student;
    }

    public String getStudents() {

        return "-";
    }
}
