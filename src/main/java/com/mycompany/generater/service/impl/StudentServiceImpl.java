package com.mycompany.generater.service.impl;

import com.mycompany.generater.model.Student;
import com.mycompany.generater.service.GeneraterService;
import com.mycompany.generater.service.StudentService;
import com.mycompany.generater.util.ScoreUtils;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mbk_i
 */
public class StudentServiceImpl implements StudentService {

    GeneraterService generaterService = new GeneraterServiceImpl();

    @Override
    public List<Student> generateStudent() {
        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            Student student = new Student(generaterService.generateIdStudent(i), ScoreUtils.generateBetween(0, 100));
            students.add(student);
        }
        return students;
    }

}
