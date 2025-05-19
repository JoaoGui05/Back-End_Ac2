package com.example.ac2part2.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ac2part2.Models.Animal;
import com.example.ac2part2.Services.AnimalService;

@RestController
@RequestMapping("/api/animais")
public class AnimalController {

    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/tutor/{tutorId}")
    public List<Animal> getAnimalsByTutor(@PathVariable Long tutorId) {
        return animalService.getAnimalsByTutor(tutorId);
    }

    @GetMapping("/{animalId}")
    public Animal getAnimalById(@PathVariable Long animalId) {
        return animalService.getAnimalById(animalId);
    }
}
