package task1.repository;

import task1.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseRepositoryInMemoryImpl {

    private final List<Course> courses = new ArrayList<>();

    public CourseRepositoryInMemoryImpl() {
        this.courses.add(new Course("JavaLab"));
        this.courses.add(new Course("PythonLab"));
        this.courses.add(new Course("C++Lab"));
    }

    public List<Course> findAll() {
        return courses;
    }
}
