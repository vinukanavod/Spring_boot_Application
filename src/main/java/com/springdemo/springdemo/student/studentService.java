package com.springdemo.springdemo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Component //@Service thuth daaanna puluwan methenta
public class studentService {

    public List<student> GetStudent() {
        return List.of(
                new student(
                        1L,
                        "marium",
                        12,
                        "cvbcvb@gmail.com",
                        LocalDate.of(2000, Month.APRIL, 12)

                )
        );
    }
}
