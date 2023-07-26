package com.springdemo.springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping(path ="api/v1/student")
public class studentController {
    private  studentService StudentService;
    @Autowired
    public studentController(studentService student ) {
        this.StudentService = student;
    }

    @GetMapping("/f")
    public String hello2(){
        return "Hai Vinuka Navod";
    }


    @GetMapping("/f/json")
    public List<student> GetStudent() {

      return StudentService.GetStudent();
    }
}
