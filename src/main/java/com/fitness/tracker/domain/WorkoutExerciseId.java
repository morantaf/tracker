package com.fitness.tracker.domain;


import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
@NoArgsConstructor
public class WorkoutExerciseId implements Serializable {
    private Long workoutId;
    private Long exerciseId;

    // Constructors, getters, setters, equals, and hashCode
}