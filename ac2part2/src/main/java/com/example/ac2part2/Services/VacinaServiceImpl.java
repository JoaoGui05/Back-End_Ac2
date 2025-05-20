package com.example.ac2part2.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ac2part2.Models.Vacina;
import com.example.ac2part2.Repositories.VacinaRepository;
import com.example.ac2part2.Services.VacinaService;

@Service
public class VacinaServiceImpl implements VacinaService {
    
    private final VacinaRepository vacinaRepository;

    @Autowired
    public VacinaServiceImpl(VacinaRepository vacinaRepository) {
        this.vacinaRepository = vacinaRepository;
    }

    @Override
    public List<Vacina> getVacinasByAnimal(Long animalId) {
        return vacinaRepository.findByAnimalId(animalId);
    }

    @Override
    public List<Vacina> getVacinasByTutor(Long tutorId) {
        return vacinaRepository.findByTutorId(tutorId);
    }
}