package aoop5a;

import java.util.List;

public interface IStudentRepository {
    void addStudent(Student student);
    Student findStudentById(String id);
    List<Student> getAllStudents();
}
