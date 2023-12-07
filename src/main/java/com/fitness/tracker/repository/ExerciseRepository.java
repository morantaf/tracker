package com.fitness.tracker.repository;

import com.fitness.tracker.domain.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

    Exercise findByName(String name);
}
