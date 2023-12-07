package com.fitness.tracker.service.implementation;

import com.fitness.tracker.domain.Exercise;
import com.fitness.tracker.domain.User;
import com.fitness.tracker.domain.Workout;
import com.fitness.tracker.domain.WorkoutExercise;
import com.fitness.tracker.repository.ExerciseRepository;
import com.fitness.tracker.repository.WorkoutExerciseRepository;
import com.fitness.tracker.repository.WorkoutRepository;
import com.fitness.tracker.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class WorkoutServiceImpl implements WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepository;

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Autowired
    private WorkoutExerciseRepository workoutExerciseRepository;

    @Transactional
    public void saveWorkout(User user, LocalDate date) {
        Workout workout = new Workout(user,date);
        workoutRepository.save(workout);
    }

    @Transactional
    public void registerExercise(Workout workout, Exercise exercise, Integer set, Integer reps, String notes) {
        WorkoutExercise workoutExercise = new WorkoutExercise(workout, exercise, set, reps, notes);
        workoutExerciseRepository.save(workoutExercise);
    }

    public Workout findWorkout(User user, LocalDate date) {
        Optional<Workout> workout = workoutRepository.findWorkout(user, date);
        return workout.orElseGet(() -> new Workout(user, date));
    }
}
