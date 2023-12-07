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
public class Workout {

    @Id
    @SequenceGenerator(name = "workout_sequence", allocationSize = 1, sequenceName = "workout_sequence")
    @GeneratedValue(generator = "workout_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Column
    private LocalDate date;

    public Workout(User user, LocalDate date) {
        this.user = user;
        this.date = date;
    }

}
