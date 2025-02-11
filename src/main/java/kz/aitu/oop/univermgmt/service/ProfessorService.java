package kz.aitu.oop.univermgmt.service;

import kz.aitu.oop.univermgmt.model.Professor;
import kz.aitu.oop.univermgmt.repository.ProfessorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProfessorService {
    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }

    public Professor addProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    public void deleteProfessor(Long id) {
        professorRepository.deleteById(id);
    }
}
