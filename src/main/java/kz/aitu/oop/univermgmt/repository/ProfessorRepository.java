package kz.aitu.oop.univermgmt.repository;

import kz.aitu.oop.univermgmt.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
