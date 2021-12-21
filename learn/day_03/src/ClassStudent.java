import java.util.ArrayList;

public class ClassStudent {
    private int totalStudent;
    private ArrayList<Student> students;

    public ClassStudent(int totalStudent) {
        this.totalStudent = totalStudent;
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudents() {
        System.out.println("===== Thông tin học viên");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("Học viên " + (i + 1)
                    + "\n\tHọ tên: " + student.getName()
                    + "\n\tTuổi: " + student.getAge()
                    + "\n\tĐịa chỉ: " + student.getAddress()
                    + "\n"
            );
        }
    }
}
