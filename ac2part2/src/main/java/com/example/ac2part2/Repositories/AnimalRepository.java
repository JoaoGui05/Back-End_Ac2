package com.example.ac2part2.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ac2part2.Models.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    List<Animal> findByTutorId(Long tutorId);
}