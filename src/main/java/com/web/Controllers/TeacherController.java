package com.web.Controllers;


import com.web.Services.TeacherService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    TeacherService teacher;


    @RequestMapping(value="/saveteacher",method = RequestMethod.POST)
    public void saveTeacher(@RequestBody String teacherData){
            teacher.saveTeacher(teacherData);
    }

}
