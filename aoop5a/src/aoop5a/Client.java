package aoop5a;

public class Client {
    public static void main(String[] args) {
        // Create repositories
        IStudentRepository studentRepository = new StudentRepository();
        ICourseRepository courseRepository = new CourseRepository();
        IEnrollmentService enrollmentService = new EnrollmentService();

        // Create students
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");

        // Add students to repository
        studentRepository.addStudent(student1);
        studentRepository.addStudent(student2);

        // Create courses
        Course course1 = new Course("C001", "Mathematics");
        Course course2 = new Course("C002", "Physics");

        // Add courses to repository
        courseRepository.addCourse(course1);
        courseRepository.addCourse(course2);

        // Enroll students in courses
        enrollmentService.enrollStudentInCourse(student1, course1);
        enrollmentService.enrollStudentInCourse(student2, course2);

        // Display enrolled students for each course
        for (Course course : courseRepository.getAllCourses()) {
            System.out.println("Course: " + course.getCourseName());
            for (Student student : course.getEnrolledStudents()) {
                System.out.println(" - " + student.getName());
            }
        }
    }
}
