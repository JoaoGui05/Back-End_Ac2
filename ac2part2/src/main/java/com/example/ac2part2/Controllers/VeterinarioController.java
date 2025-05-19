package com.example.ac2part2.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ac2part2.Models.Veterinario;
import com.example.ac2part2.Services.VeterinarioService;

@RestController
@RequestMapping("/api/veterinarios")
public class VeterinarioController {

    private final VeterinarioService veterinarioService;

    @Autowired
    public VeterinarioController(VeterinarioService veterinarioService) {
        this.veterinarioService = veterinarioService;
    }

    @GetMapping("/{crm}")
    public Veterinario getVeterinarioByCrm(@PathVariable String crm) {
        return veterinarioService.getVeterinarioByCrm(crm);
    }

    @GetMapping("/id/{id}")
    public Veterinario getVeterinarioById(@PathVariable Long id) {
        return veterinarioService.getVeterinarioById(id);
    }

    @PostMapping
    public Veterinario createVeterinario(@RequestBody Veterinario veterinario) {
        return veterinarioService.createVeterinario(veterinario);
    } 
}
