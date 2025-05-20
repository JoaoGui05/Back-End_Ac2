package com.example.ac2part2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ac2part2.Models.Veterinario;

public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {
    Veterinario findByCrm(String crm);
}
