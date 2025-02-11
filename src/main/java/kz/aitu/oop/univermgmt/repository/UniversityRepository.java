package kz.aitu.oop.univermgmt.repository;

import kz.aitu.oop.univermgmt.model.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository extends JpaRepository<University, Long> {
}
