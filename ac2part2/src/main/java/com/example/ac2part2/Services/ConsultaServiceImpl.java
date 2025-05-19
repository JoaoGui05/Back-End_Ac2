package com.example.ac2part2.Services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ac2part2.Models.Consulta;
import com.example.ac2part2.Repositories.ConsultaRepository;
import com.example.ac2part2.Repositories.VeterinarioRepository;

@Service
public class ConsultaServiceImpl implements ConsultaService {

    private final ConsultaRepository consultaRepository;
    private final VeterinarioRepository veterinarioRepository;

    @Autowired
    public ConsultaServiceImpl(ConsultaRepository consultaRepository, VeterinarioRepository veterinarioRepository) {
        this.consultaRepository = consultaRepository;
        this.veterinarioRepository = veterinarioRepository;
    }

    @Override
    public boolean isVeterinarioAvailable(Long veterinarioId, LocalDateTime dataHora) {
        List<Consulta> consultas = consultaRepository.findByVeterinarioIdAndDataHora(veterinarioId, dataHora);
        return consultas.isEmpty();
    }

    @Override
    public boolean isVeterinarioSpecialized(Long veterinarioId, String especie) {
        return veterinarioRepository.findById(veterinarioId)
                .map(v -> v.getEspecializacoes().contains(especie))
                .orElse(false);
    }

    @Override
    public Consulta scheduleConsulta(Consulta consulta) {
        Long vetId = consulta.getVeterinario().getId();
    String especie = consulta.getAnimal().getEspecie();
    LocalDateTime dataHora = consulta.getDataHora();

    if (!isVeterinarioAvailable(vetId, dataHora)) {
        throw new RuntimeException("Veterinário já possui uma consulta nesse horário.");
    }

    if (!isVeterinarioSpecialized(vetId, especie)) {
        throw new RuntimeException("Veterinário não possui especialização para a espécie do animal.");
    }

    return consultaRepository.save(consulta);
}
    @Override
    public List<Consulta> getConsultasByAnimal(Long animalId) {
        return consultaRepository.findByAnimalId(animalId);
    }    
}