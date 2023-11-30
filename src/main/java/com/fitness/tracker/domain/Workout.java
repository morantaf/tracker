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
public class Workout {

    @Id
    @SequenceGenerator(name = "workout_sequence", allocationSize = 1, sequenceName = "workout_sequence")
    @GeneratedValue(generator = "workout_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    private User user;

}
