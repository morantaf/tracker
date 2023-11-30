package com.fitness.tracker.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table
@NoArgsConstructor
public class MealLog {

    @Id
    @SequenceGenerator(name = "meal_log_sequence", allocationSize = 1, sequenceName = "meal_log_sequence")
    @GeneratedValue(generator = "meal_log_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    User user;

    @Column
    LocalDate date;

    @Column
    Integer totalCalories;
}
