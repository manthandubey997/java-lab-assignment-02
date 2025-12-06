package service;

import model.Student;
import java.util.HashMap;

public class StudentManager implements RecordActions {

    private HashMap<Integer, Student> studentMap = new HashMap<>();

    @Override
    public void addStudent(Student s) {
        if (studentMap.containsKey(s.getRollNo())) {
            System.out.println("Error: Duplicate roll number not allowed.");
        } else {
            studentMap.put(s.getRollNo(), s);
            System.out.println("Student added successfully.");
        }
    }

    @Override
    public void deleteStudent(int rollNo) {
        if (studentMap.remove(rollNo) != null)
            System.out.println("Student deleted.");
        else
            System.out.println("Student not found.");
    }

    @Override
    public void updateStudent(int rollNo, Student newDetails) {
        if (studentMap.containsKey(rollNo)) {
            studentMap.put(rollNo, newDetails);
            System.out.println("Student updated.");
        } else {
            System.out.println("Student not found.");
        }
    }

    @Override
    public Student searchStudent(int rollNo) {
        return studentMap.get(rollNo);
    }

    @Override
    public void viewAllStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        for (Student s : studentMap.values()) {
            s.displayInfo();
            System.out.println("-----------------------");
        }
    }
}
