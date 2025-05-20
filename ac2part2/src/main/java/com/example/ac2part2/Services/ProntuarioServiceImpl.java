package com.example.ac2part2.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ac2part2.Models.Prontuario;
import com.example.ac2part2.Repositories.ProntuarioRepository;

@Service
public class ProntuarioServiceImpl implements ProntuarioService {

    private final ProntuarioRepository prontuarioRepository;

    @Autowired
    public ProntuarioServiceImpl(ProntuarioRepository prontuarioRepository) {
        this.prontuarioRepository = prontuarioRepository;
    }

    @Override
    public Prontuario createProntuario(Prontuario prontuario) {
        return prontuarioRepository.save(prontuario);
    }

    @Override
    public Prontuario getProntuarioByConsulta(Long consultaId) {
        return prontuarioRepository.findByConsultaId(consultaId);
    }
}
