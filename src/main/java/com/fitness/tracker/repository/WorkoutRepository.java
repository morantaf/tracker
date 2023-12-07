package com.fitness.tracker.repository;

import com.fitness.tracker.domain.User;
import com.fitness.tracker.domain.Workout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.Optional;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {


    @Query("SELECT w from Workout w where w.user = :user and w.date = :date")
    Optional<Workout> findWorkout(User user, LocalDate date);
}
