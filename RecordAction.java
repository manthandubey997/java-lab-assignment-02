package service;

import model.Student;

public interface RecordActions {

    void addStudent(Student s);
    void deleteStudent(int rollNo);
    void updateStudent(int rollNo, Student newDetails);
    Student searchStudent(int rollNo);
    void viewAllStudents();
}
