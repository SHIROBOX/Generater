package com.mycompany.generater;

import com.mycompany.generater.model.Student;
import com.mycompany.generater.service.StudentService;
import com.mycompany.generater.service.impl.StudentServiceImpl;
import java.util.List;

/**
 *
 * @author mbk_i
 */
public class Generater {

    public static void main(String[] args) {
        StudentService service = new StudentServiceImpl();
        List<Student> students = service.generateStudent();
        for (Student student : students) {
            System.out.println("[ " + student.getId() + " : " + student.getScore() + " ]");
        }
    }
}
