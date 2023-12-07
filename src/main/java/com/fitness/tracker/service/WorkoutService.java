package com.fitness.tracker.service;

import com.fitness.tracker.domain.Exercise;
import com.fitness.tracker.domain.User;
import com.fitness.tracker.domain.Workout;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public interface WorkoutService {

    void saveWorkout(User user, LocalDate date);

    void registerExercise(Workout workout, Exercise exercise, Integer set, Integer reps, String notes);

    Workout findWorkout(User user, LocalDate date);

}
