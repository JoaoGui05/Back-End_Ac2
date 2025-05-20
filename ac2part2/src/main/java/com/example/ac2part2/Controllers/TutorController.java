package com.example.ac2part2.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ac2part2.Models.Tutor;
import com.example.ac2part2.Services.TutorService;

@RestController
@RequestMapping("/api/tutores")
public class TutorController {

    private final TutorService tutorService;

    @Autowired
    public TutorController(TutorService tutorService) {
        this.tutorService = tutorService;
    }

    @GetMapping("/{cpf}")
    public Tutor getTutorByCpf(@PathVariable String cpf) {
        return tutorService.getTutorByCpf(cpf);
    }

    @GetMapping("/id/{id}")
    public Tutor getTutorById(@PathVariable Long id) {
        return tutorService.getTutorById(id);
    }

    @PostMapping
    public Tutor createTutor(@RequestBody Tutor tutor) {
        return tutorService.createTutor(tutor);
    } 
}
    