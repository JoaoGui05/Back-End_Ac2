package com.example.ac2part2.Repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ac2part2.Models.Consulta;
import com.example.ac2part2.Models.Veterinario;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    List<Consulta> findByVeterinarioIdAndDataHora(Long veterinarioId, LocalDateTime dataHora);
    List<Consulta> findByAnimalId(Long animalId);
    boolean existsByVeterinarioAndDataHora(Veterinario veterinario, LocalDateTime dataHora);
}