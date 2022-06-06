package com.web.Services;


import com.web.Model.TeacherData;
import com.web.Repository.TeacherRepo;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    TeacherRepo teacherRepo;

    public void saveTeacher(String teacherData){
        TeacherData teacher=new TeacherData();
        teacher.setTeacherName(teacherData);
        teacherRepo.saveTeacher(teacherData);
    }
}
