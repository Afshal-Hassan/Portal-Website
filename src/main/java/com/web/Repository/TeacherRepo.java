package com.web.Repository;

public class TeacherRepo {

    String teacherSavedData;

    public void saveTeacher(String teacherData){
        this.teacherSavedData=teacherData;
        System.out.println(teacherData);
    }
}
