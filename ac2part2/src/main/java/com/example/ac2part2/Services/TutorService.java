package com.example.ac2part2.Services;

import com.example.ac2part2.Models.Tutor;

public interface TutorService {
    Tutor getTutorByCpf(String cpf);
    Tutor getTutorById(Long id);
    Tutor createTutor(Tutor tutor);

}
