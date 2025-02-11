package kz.aitu.oop.univermgmt.service;

import kz.aitu.oop.univermgmt.model.University;
import kz.aitu.oop.univermgmt.repository.UniversityRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UniversityService {
    private final UniversityRepository universityRepository;

    public UniversityService(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    public List<University> getAllUniversities() {
        return universityRepository.findAll();
    }

    public University addUniversity(University university) {
        return universityRepository.save(university);
    }

    public void deleteUniversity(Long id) {
        universityRepository.deleteById(id);
    }
}
