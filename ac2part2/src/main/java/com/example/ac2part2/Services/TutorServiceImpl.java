package com.example.ac2part2.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ac2part2.Models.Tutor;
import com.example.ac2part2.Repositories.TutorRepository;

@Service
public class TutorServiceImpl implements TutorService {

    private final TutorRepository tutorRepository;

    @Autowired
    public TutorServiceImpl(TutorRepository tutorRepository) {
        this.tutorRepository = tutorRepository;
    }

    @Override
    public Tutor getTutorByCpf(String cpf) {
        return tutorRepository.findByCpf(cpf);
    }

    @Override
    public Tutor getTutorById(Long id) {
        return tutorRepository.findById(id).orElse(null);
    }

    @Override
    public Tutor createTutor(Tutor tutor) {
        return tutorRepository.save(tutor);
    }
}
