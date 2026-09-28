package task1;

import task1.entities.Course;
import task1.entities.TrainingPlan;
import task1.entities.User;
import task1.repository.CourseRepositoryInMemoryImpl;
import task1.repository.TrainingPlanRepositoryInMemoryImpl;
import task1.repository.UserRepositoryInMemoryImpl;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserRepositoryInMemoryImpl userRepository = new UserRepositoryInMemoryImpl();
        TrainingPlanRepositoryInMemoryImpl planRepository = new TrainingPlanRepositoryInMemoryImpl():
        CourseRepositoryInMemoryImpl courseRepository = new CourseRepositoryInMemoryImpl();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email");
        String email = scanner.nextLine();

        User current = userRepository.finUserByEmail(email);
        System.out.println("List of courses:");
        List<Course> courses = courseRepository.findAll();
        System.out.println(courses);
        System.out.println("Enter the course number");
        int courseNumber = scanner.nextInt();
        Course course = courses.get(courseNumber);

        TrainingPlan plan = new TrainingPlan();
        plan.addCourse(course);
        plan.setUser(current);

        planRepository.save(plan);

    }
}