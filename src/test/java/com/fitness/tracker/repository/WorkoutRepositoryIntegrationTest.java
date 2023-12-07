package com.fitness.tracker.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.fitness.tracker.domain.User;
import com.fitness.tracker.domain.Workout;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.time.LocalDate;
import java.util.Optional;

@DataJpaTest
public class WorkoutRepositoryIntegrationTest {

    @Autowired
    WorkoutRepository workoutRepository;

    @Autowired
    TestEntityManager entityManager;

    @Test
    void findWorkoutSuccess() {
        // given
        User user = new User("username", "password");
        LocalDate today = LocalDate.now();
        entityManager.persist(user);
        Workout workout = new Workout(user, today);
        entityManager.persist(workout);

        // when
        Optional<Workout> searchedWorkout = workoutRepository.findWorkout(user,today);

        // then
        assertThat(searchedWorkout).contains(workout);
    }
}
