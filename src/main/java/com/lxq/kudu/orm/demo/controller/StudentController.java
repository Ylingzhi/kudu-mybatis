package com.lxq.kudu.orm.demo.controller;

import com.lxq.kudu.orm.demo.domain.Student;
import com.lxq.kudu.orm.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p></p>
 *
 * @author lixq
 * @since 2019/12/8
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @PostMapping(value = "/add")
    public Student add(@RequestBody Student student) {
        studentService.add(student);
        return student;
    }

    @GetMapping(value = "/find")
    public Student find(@RequestParam(value = "sId") String sId) {
        return studentService.find(sId);
    }
}
