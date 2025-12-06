import model.Student;
import model.FinalNote;
import service.StudentManager;

public class MainApp {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Student s1 = new Student(101, "Ankit", "ankit@mail.com", "B.Tech", 85);
        Student s2 = new Student(102, "Riya", "riya@mail.com", "M.Tech", 92);

        manager.addStudent(s1);
        manager.addStudent(s2);

        manager.viewAllStudents();

        // Demonstrate overloading
        System.out.println("[Note] Overloaded display method:");
        s1.displayInfo(true);

        // Final class demonstration
        FinalNote fn = new FinalNote();
        fn.showMessage();

        // Trigger finalize message (not guaranteed but shown for assignment)
        s1 = null;
        System.gc();
    }
}
