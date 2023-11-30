package com.fitness.tracker.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table
@NoArgsConstructor
public class WeightLog {

    @Id
    @SequenceGenerator(name = "weight_log_sequence", allocationSize = 1, sequenceName = "weight_log_sequence")
    @GeneratedValue(generator = "weight_log_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    User user;

    @Column
    Float weight;

    @Column
    LocalDate date;

}
