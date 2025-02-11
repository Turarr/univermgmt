package kz.aitu.oop.univermgmt.controller;

import kz.aitu.oop.univermgmt.model.University;
import kz.aitu.oop.univermgmt.service.UniversityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/universities")
public class UniversityController {
    private final UniversityService universityService;

    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }

    @GetMapping
    public List<University> getUniversities() {
        return universityService.getAllUniversities();
    }

    @PostMapping
    public University addUniversity(@RequestBody University university) {
        return universityService.addUniversity(university);
    }

    @DeleteMapping("/{id}")
    public void deleteUniversity(@PathVariable Long id) {
        universityService.deleteUniversity(id);
    }
}
