package domain.db;

import domain.model.Student;

import java.util.ArrayList;

public class StudentDB {
    private ArrayList<Student> students;

    public StudentDB(){
        this.students = new ArrayList<>();

        Student greetje = new Student("Jongen", "Greetje", "Toegepaste Informatica", 23);
        Student kristien = new Student("Melaerts", "Kristien", "Chemie", 21);
        Student elke = new Student("Steegmans", "Elke", "Vroedkunde", 16);
        Student jan = new Student("Van Hee", "Jan", "Verpleegkunde", 18);

        students.add(greetje);
        students.add(kristien);
        students.add(elke);
        students.add(jan);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Student getStudent(String name, String firstName){
        for(Student student : this.students){
            if(student.getNaam().equalsIgnoreCase(name) && student.getVoornaam().equalsIgnoreCase(firstName))
                return student;
        }
        return null;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }
}
