package com.example.ac2part2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ac2part2.Models.Prontuario;

public interface ProntuarioRepository extends JpaRepository<Prontuario, Long> {
    Prontuario findByConsultaId(Long consultaId);
}