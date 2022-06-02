package dev.danvega;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import dev.danvega.config.AppConfig;
import dev.danvega.service.CourseService;

public class Application {
    public static void main( String[] args ){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CourseService service = applicationContext.getBean("courseService", CourseService.class);
        System.out.println(service.list());
    }
}
