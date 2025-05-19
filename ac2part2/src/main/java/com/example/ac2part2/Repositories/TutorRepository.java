package com.example.ac2part2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ac2part2.Models.Tutor;

public interface TutorRepository extends JpaRepository<Tutor, Long> {
    Tutor findByCpf(String cpf);
}