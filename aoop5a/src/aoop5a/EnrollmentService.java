package aoop5a;

public class EnrollmentService implements IEnrollmentService {
    @Override
    public void enrollStudentInCourse(Student student, Course course) {
        student.enrollInCourse(course);
    }
}
