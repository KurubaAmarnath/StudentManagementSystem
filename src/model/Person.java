package model;
public abstract class Person{
    private String name;
    private int age;
    public Person(String name , int age){
        this.name = name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name) {
    if (name == null || name.isBlank()) {
        throw new IllegalArgumentException("Name cannot be empty.");
    }
    this.name = name;
    }

    public void setAge(int age) {
    if (age <= 0) {
        throw new IllegalArgumentException("Age must be positive.");
    }
    this.age = age;
    }
    public abstract void displayDetails();
    
}