package com.example.ac2part2.Services;

import java.util.List;

import com.example.ac2part2.Models.Vacina;

public interface VacinaService {
    List<Vacina> getVacinasByAnimal(Long animalId);
    List<Vacina> getVacinasByTutor(Long tutorId);
}