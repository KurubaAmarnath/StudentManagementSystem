package app;

import java.util.Scanner;

import model.Address;
import model.Student;
import service.StudentService;
import exception.StudentNotFoundException;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Display Total Students");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1 -> {
                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();

                        System.out.print("Enter Marks: ");
                        double marks = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter Street: ");
                        String street = sc.nextLine();

                        System.out.print("Enter City: ");
                        String city = sc.nextLine();

                        System.out.print("Enter State: ");
                        String state = sc.nextLine();

                        System.out.print("Enter Pincode: ");
                        String pincode = sc.nextLine();

                        Address address = new Address(
                                street, city, state, pincode
                        );

                        Student student = new Student(
                                id, name, age, marks, address
                        );

                        service.addStudent(student);
                    }

                    case 2 -> service.displayAllStudents();

                    case 3 -> {
                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();

                        Student student = service.searchStudent(id);
                        student.printDetails();
                    }

                    case 4 -> {
                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter New Age: ");
                        int age = sc.nextInt();

                        service.updateStudent(id, name, age);
                    }

                    case 5 -> {
                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();

                        service.deleteStudent(id);
                    }

                    case 6 ->
                            System.out.println(
                                    "Total Students: " + service.getStudentCount()
                            );

                    case 0 ->
                            System.out.println("Thank you!");

                    default ->
                            System.out.println("Invalid choice.");
                }

            } catch (StudentNotFoundException |
                     IllegalArgumentException e) {

                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 0);

        sc.close();
    }
}