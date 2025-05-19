package com.example.ac2part2.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ac2part2.Models.Vacina;
import com.example.ac2part2.Repositories.VacinaRepository;
import com.example.ac2part2.Services.VacinaService;

@Service
public class VacinaServiceImpl implements VacinaService {
    
    @Autowired
    private VacinaRepository vacinaRepository;

    @Override
    public List<Vacina> getVacinasByAnimal(Long animalId) {
        return vacinaRepository.findByAnimalId(animalId);
    }
    
}
