package com.github.pedrobacchini.springboottestgradleflyway.repository;

import com.github.pedrobacchini.springboottestgradleflyway.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findByName(String name);
}
