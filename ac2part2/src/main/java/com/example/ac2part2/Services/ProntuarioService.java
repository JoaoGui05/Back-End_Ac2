package com.example.ac2part2.Services;

import com.example.ac2part2.Models.Prontuario;

public interface ProntuarioService {
    Prontuario createProntuario(Prontuario prontuario);
    Prontuario getProntuarioByConsulta(Long consultaId);
}
