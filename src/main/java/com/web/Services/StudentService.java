package com.web.Services;


import com.web.Model.StudentData;
import com.web.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


        StudentRepo studentrepo=new StudentRepo();

        public void saveStudent(String studentdata){
            StudentData student =new StudentData();
            student.setStudentName(studentdata);
            studentrepo.saveStudent(studentdata);


        }

}
