package com.example.ac2part2.Services;

import java.util.List;

import com.example.ac2part2.Models.Animal;

public interface AnimalService {
    List<Animal> getAnimalsByTutor(Long tutorId);
    Animal getAnimalById(Long animalId);
}