package com.example.ac2part2.Services;

import com.example.ac2part2.Models.Veterinario;

public interface VeterinarioService {
    Veterinario getVeterinarioByCrm(String crm);
    Veterinario getVeterinarioById(Long id);
    Veterinario createVeterinario(Veterinario veterinario);
}