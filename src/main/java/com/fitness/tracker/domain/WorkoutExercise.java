package com.fitness.tracker.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "workouts_exercises")
@Table
@NoArgsConstructor
public class WorkoutExercise {

    @EmbeddedId
    private WorkoutExerciseId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("workoutId")
    @JoinColumn(name = "workout_id")
    private Workout workout;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("exerciseId")
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    @Column
    private Integer set;

    @Column
    private Integer reps;

    @Column
    private String notes;

    //TODO: rest time
}
