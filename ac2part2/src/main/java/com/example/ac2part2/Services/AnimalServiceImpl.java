package com.example.ac2part2.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ac2part2.Models.Animal;
import com.example.ac2part2.Repositories.AnimalRepository;

@Service
public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalServiceImpl(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public List<Animal> getAnimalsByTutor(Long tutorId) {
        return animalRepository.findByTutorId(tutorId);
    }

    @Override
    public Animal getAnimalById(Long animalId) {
        return animalRepository.findById(animalId).orElse(null);
    }
}