package kz.aitu.oop.univermgmt.repository;

import kz.aitu.oop.univermgmt.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
