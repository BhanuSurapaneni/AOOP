package aoop5a;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private List<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public Student findStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }
}
