package service;

import exception.StudentNotFoundException;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        for (Student student : students) {
            student.printDetails();
            System.out.println("----------------------");
        }
    }

    public Student searchStudent(int id) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getStudentId() == id) {
                return student;
            }
        }

        throw new StudentNotFoundException(
                "Student with ID " + id + " not found."
        );
    }

    public void updateStudent(int id, String name, int age)
            throws StudentNotFoundException {

        Student student = searchStudent(id);

        student.setName(name);
        student.setAge(age);

        System.out.println("Student updated successfully!");
    }

    public void deleteStudent(int id) throws StudentNotFoundException {
        Student student = searchStudent(id);

        students.remove(student);

        System.out.println("Student deleted successfully!");
    }

    public int getStudentCount() {
        return students.size();
    }
}