package com.example.coursecrud;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseRepository repo;

    public CourseController(CourseRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Course> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public String addCourse(@RequestBody Course course) {
        repo.save(course);
        return "Course added successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable int id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Course deleted!";
        }
        return "Course not found!";
    }

    @PutMapping("/{id}")
    public String updateCourse(@PathVariable int id,
                               @RequestBody Course updatedCourse) {

        return repo.findById(id)
                .map(course -> {
                    course.setCourseCode(updatedCourse.getCourseCode());
                    course.setCourseName(updatedCourse.getCourseName());
                    repo.save(course);
                    return "Course updated successfully";
                })
                .orElse("Course not updated");
    }
}
