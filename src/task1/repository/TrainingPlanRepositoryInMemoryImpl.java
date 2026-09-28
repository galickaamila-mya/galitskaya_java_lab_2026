package task1.repository;

import task1.entities.TrainingPlan;

import java.util.ArrayList;
import java.util.List;

public class TrainingPlanRepositoryInMemoryImpl {

    private final List<TrainingPlan> plans = new ArrayList<>();

    public TrainingPlanRepositoryInMemoryImpl() {

    }

    public void save(TrainingPlan plan) {
        if (plan != null) {
            plans.add(plan);
        } else throw new RuntimeException("Plan can not be null");
    }

    public List<TrainingPlan> findAllByUser_Email(String email) {
        List<TrainingPlan> plansOfUser = new ArrayList<>();
        for (TrainingPlan plan : plans) {
            if (plan.getUser().getEmail().equals(email)) {
                plansOfUser.add(plan);
            }
        }
        return plansOfUser;
    }
}
