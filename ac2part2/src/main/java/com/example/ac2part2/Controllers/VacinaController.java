package com.example.ac2part2.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ac2part2.Models.Vacina;
import com.example.ac2part2.Services.VacinaService;

@RestController
@RequestMapping("/api/vacinas")
public class VacinaController {

    @Autowired
    private VacinaService vacinaService;

    @GetMapping("/animal/{animalId}")
    public List<Vacina> getVacinasByAnimal(@PathVariable Long animalId) {
        return vacinaService.getVacinasByAnimal(animalId);
    }

    @GetMapping("/tutor/{tutorId}/vacinas")
    public List<Vacina> getVacinasByTutor(@PathVariable Long tutorId) {
        return vacinaService.getVacinasByAnimal(tutorId);
    }
}
