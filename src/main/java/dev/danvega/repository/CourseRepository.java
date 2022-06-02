package dev.danvega.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import dev.danvega.model.Course;

@Repository
public class CourseRepository implements CrudRepository<Course> {

    @Override
    public List<Course> findall() {
        List<Course> courses = new ArrayList<>();
        Course springBoot = new Course(1, 
            "Getting Started with Spring Boot", 
            "Learn How to Build Applications with Spring Boot", 
            "https://www.danvega.dev/courses/");
        courses.add(springBoot);
        return courses;
    }
    
}
