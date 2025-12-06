package model;

public class Student extends Person {

    private int rollNo;
    private String course;
    private double marks;
    private char grade;

    // Default Constructor
    public Student() {}

    // Parameterized Constructor
    public Student(int rollNo, String name, String email, String course, double marks) {
        super(name, email);
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
        calculateGrade();
    }

    // Overloaded constructor (polymorphism example)
    public Student(int rollNo, String name, String email, String course) {
        this(rollNo, name, email, course, 0.0);
    }

    // Grade Calculation
    public void calculateGrade() {
        if (marks >= 90) grade = 'A';
        else if (marks >= 75) grade = 'B';
        else if (marks >= 60) grade = 'C';
        else grade = 'D';
    }

    // Getters
    public int getRollNo() { return rollNo; }

    // Method Overriding
    @Override
    public void displayInfo() {
        System.out.println("Student Info:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
    }

    // Overloaded displayInfo() (expected output)
    public void displayInfo(boolean showGrade) {
        displayInfo();
        if (showGrade) {
            System.out.println("Grade: " + grade);
        }
    }

    // finalize() method (for expected output)
    @Override
    protected void finalize() {
        System.out.println("Finalize method called before object is garbage collected.");
    }
}
