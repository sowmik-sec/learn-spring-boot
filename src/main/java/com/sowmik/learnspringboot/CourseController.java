package com.sowmik.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    //courses
    // course: id, name, author
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "Youtube"),
                new Course(2, "Learn Spring", "Udemy"),
                new Course(3, "Learn Spring Boot", "Udemy"),
                new Course(4, "Learn Spring Security", "Udemy")
        );
    }
}
