package com.fitness.tracker.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
@NoArgsConstructor
public class Meal {

    @Id
    @SequenceGenerator(name = "meal_sequence", allocationSize = 1, sequenceName = "meal_sequence")
    @GeneratedValue(generator = "meal_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String name;

    @Column
    private Integer calories;
}
