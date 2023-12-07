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
public class Exercise {

    @Id
    @SequenceGenerator(name = "exercise_sequence", allocationSize = 1, sequenceName = "exercise_sequence")
    @GeneratedValue(generator = "exercise_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String name;

    public Exercise(String name) {
        this.name = name;
    }
}
