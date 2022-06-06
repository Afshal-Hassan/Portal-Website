package com.web.Controllers;


import com.web.Model.StudentData;
import com.web.Repository.StudentRepo;
import com.web.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController

public class StudentController {


    StudentService studentservice =new StudentService();

    @RequestMapping(value="/api", method=RequestMethod.POST)
    public void saveStudent(@RequestBody String name){


        studentservice.saveStudent(name);
    }
}
