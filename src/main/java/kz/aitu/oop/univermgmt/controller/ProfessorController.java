package kz.aitu.oop.univermgmt.controller;

import kz.aitu.oop.univermgmt.model.Professor;
import kz.aitu.oop.univermgmt.service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/professors")
public class ProfessorController {
    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping
    public List<Professor> getProfessors() {
        return professorService.getAllProfessors();
    }

    @PostMapping
    public Professor addProfessor(@RequestBody Professor professor) {
        return professorService.addProfessor(professor);
    }

    @DeleteMapping("/{id}")
    public void deleteProfessor(@PathVariable Long id) {
        professorService.deleteProfessor(id);
    }
}
