package com.github.pedrobacchini.springboottestgradleflyway.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Getter
@Table(name = "person")
@NoArgsConstructor
public class Employee {

    @Id
    @SequenceGenerator(name = "person_id_seq", sequenceName = "person_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_id_seq")
    private Long id;

    @Column(nullable = false, unique = true)
    @Size(min = 3, max = 20)
    private String name;

    public Employee(@Size(min = 3, max = 20) String name) { this.name = name; }
}
