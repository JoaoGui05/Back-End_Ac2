package com.example.ac2part2.Controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ac2part2.Models.Consulta;
import com.example.ac2part2.Services.ConsultaService;

@RestController
@RequestMapping("/api/consultas")
public class ConsultaController {

    private final ConsultaService consultaService;

    @Autowired
    public ConsultaController(ConsultaService consultaService) {
        this.consultaService = consultaService;
    }

    @PostMapping
    public Consulta scheduleConsulta(@RequestBody Consulta consulta) {
        return consultaService.scheduleConsulta(consulta);
    }

    @GetMapping("/verificar")
    public boolean isVeterinarioAvailable(
    @RequestParam Long veterinarioId,
    @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dataHora) {
        return consultaService.isVeterinarioAvailable(veterinarioId, dataHora);
}

    @GetMapping("/animal/{animalId}")
    public List<Consulta> getConsultasByAnimal(@PathVariable Long animalId) {
        return consultaService.getConsultasByAnimal(animalId);
    }
}