package com.example.ac2part2.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ac2part2.Models.Veterinario;
import com.example.ac2part2.Repositories.VeterinarioRepository;

@Service
public class VeterinarioServiceImpl implements VeterinarioService {

    private final VeterinarioRepository veterinarioRepository;

    @Autowired
    public VeterinarioServiceImpl(VeterinarioRepository veterinarioRepository) {
        this.veterinarioRepository = veterinarioRepository;
    }

    @Override
    public Veterinario getVeterinarioByCrm(String crm) {
        return veterinarioRepository.findByCrm(crm);
    }

    @Override
    public Veterinario getVeterinarioById(Long id) {
        return veterinarioRepository.findById(id).orElse(null);
    }

    @Override
    public Veterinario createVeterinario(Veterinario veterinario) {
        return veterinarioRepository.save(veterinario);
    }
}
