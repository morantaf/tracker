package com.fitness.tracker.service.implementation;

import com.fitness.tracker.domain.Exercise;
import com.fitness.tracker.repository.ExerciseRepository;
import com.fitness.tracker.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    public void saveExercise(String name) {
        Exercise exercise = new Exercise(name);
        exerciseRepository.save(exercise);
    }

    public Exercise findByName(String name) {
        return exerciseRepository.findByName(name);
    }
}
