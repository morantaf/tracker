package com.fitness.tracker.controller;

import com.fitness.tracker.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;


}
