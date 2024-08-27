package aoop5a;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository implements ICourseRepository {
    private List<Course> courses;

    public CourseRepository() {
        this.courses = new ArrayList<>();
    }

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public Course findCourseById(String courseId) {
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }
}
