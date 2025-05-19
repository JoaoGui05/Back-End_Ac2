package com.example.ac2part2.Services;

import java.time.LocalDateTime;
import java.util.List;

import com.example.ac2part2.Models.Consulta;

public interface ConsultaService {
    boolean isVeterinarioAvailable(Long veterinarioId, LocalDateTime dataHora);
    boolean isVeterinarioSpecialized(Long veterinarioId, String especie);
    Consulta scheduleConsulta(Consulta consulta);
    List<Consulta> getConsultasByAnimal(Long animalId);
}