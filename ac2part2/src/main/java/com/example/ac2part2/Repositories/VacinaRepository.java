package com.example.ac2part2.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ac2part2.Models.Vacina;

public interface VacinaRepository extends JpaRepository<Vacina, Long> {
    List<Vacina> findByAnimalId(Long animalId);
    List<Vacina> getVacinasByTutor(Long tutorId);
    @Query("SELECT v FROM Vacina v WHERE v.animal.tutor.id = :tutorId")
    List<Vacina> findByTutorId(@Param("tutorId") Long tutorId);
}