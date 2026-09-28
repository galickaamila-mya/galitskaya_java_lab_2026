package task1.entities;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TrainingPlan {

    private final List<Course> electiveCourses = new ArrayList<>();
    private User user;

    public void addCourse(Course course) {
        this.electiveCourses.add(course);
    }
}
