package model;
import interfaces.Printable;
public final class Student extends Person implements Printable{
    private final int studentId;
    private double marks;
    private Address address;
    
    private static int totalStudents=0;
     
    public Student( int studentId,String name, int age, double marks,Address address){
        super(name,age);
        if( studentId <= 0){
            throw new IllegalArgumentException("Student ID must be postive.");
        }
        if ( marks < 0 || marks > 100){
            throw new IllegalArgumentException("Marks must be ) and 100.");
        } 
        if(address == null){
            throw new IllegalArgumentException("Address cannot be null.");
        }
        this.studentId=studentId;
        this.marks=marks;
        this.address=address;
        totalStudents++;
    }
    public int getStudentId(){
        return studentId;
    }
    public double getMarks(){
        return marks;
    }
    public void setMarks(double marks){
        if(marks < 0 || marks > 100){
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }
        this.marks=marks;
    }
    public Address getAddress(){
        return address;
    }
    public void setAddress(Address address){
        if(address == null){
            throw new IllegalArgumentException("Address cannot be null.");
        }
        this.address = address;
    }
    public StudentGrade getGrade(){
        return StudentGrade.calculate(marks);
    }
    public static int getTotalStudents(){
        return totalStudents;
    }
    @Override 
    public void displayDetails(){
        printDetails();
    }
    @Override 
    public void printDetails(){
        System.out.println("Student ID : " + studentId);
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + getGrade());
        System.out.println("Address : " + address.street() + ", " + address.city() + ", " + address.state() + "- " + address.pincode());
    }

}