package com.fitness.tracker.controller;

import com.fitness.tracker.dto.ExerciseDTO;
import com.fitness.tracker.service.ExerciseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/exercise")
public class ExerciseController {

    private ExerciseService exerciseService;

    @GetMapping("/")
    public String list(Model model) {
        return "exercise/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        ExerciseDTO exerciseDTO = new ExerciseDTO();
        model.addAttribute("exerciseDTO", exerciseDTO);
        return "exercise/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("exerciseDTO") ExerciseDTO request) {
        exerciseService.saveExercise(request.getName());
        return "save";
    }


}
