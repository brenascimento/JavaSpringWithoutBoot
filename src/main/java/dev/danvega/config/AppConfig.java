package dev.danvega.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import dev.danvega.repository.CourseRepository;
import dev.danvega.service.CourseService;

@Configuration 
@ComponentScan("dev.danvega")
public class AppConfig {

    // @Bean("courseRepository")
    // public CourseRepository getCourseRepository(){
    //     return new CourseRepository();
    // }
    
    // @Bean("courseService")
    // public CourseService getCourseService(){
    //     return new CourseService(getCourseRepository());
    // }
}
