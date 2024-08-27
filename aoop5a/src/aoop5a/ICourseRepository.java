package aoop5a;

import java.util.List;

public interface ICourseRepository {
    void addCourse(Course course);
    Course findCourseById(String courseId);
    List<Course> getAllCourses();
}
