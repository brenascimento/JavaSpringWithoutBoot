package dev.danvega.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import dev.danvega.model.Course;
import dev.danvega.repository.CourseRepository;

@Service
public class CourseService implements CrudService<Course>{

    CourseRepository repository;

    public CourseService(CourseRepository courseRepository){
        this.repository = courseRepository;
    }

    public List<Course> list() {
        return repository.findall();
    }

    public Course create(Course t) {
        return null;
    }

    public Optional<Course> get(int id) {
        return null;
    }

    public void update(Course t, int id) {
        
    }

    public void delete(int id) {
    }
}
