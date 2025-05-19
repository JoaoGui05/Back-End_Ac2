package com.example.ac2part2.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ac2part2.Models.Prontuario;
import com.example.ac2part2.Services.ProntuarioService;

@RestController
@RequestMapping("/api/prontuarios")
public class ProntuarioController {

    private final ProntuarioService prontuarioService;

    @Autowired
    public ProntuarioController(ProntuarioService prontuarioService) {
        this.prontuarioService = prontuarioService;
    }

    @PostMapping
    public Prontuario createProntuario(@RequestBody Prontuario prontuario) {
        return prontuarioService.createProntuario(prontuario);
    }

    @GetMapping("/consulta/{consultaId}")
    public Prontuario getProntuarioByConsulta(@PathVariable Long consultaId) {
        return prontuarioService.getProntuarioByConsulta(consultaId);
    }
}
