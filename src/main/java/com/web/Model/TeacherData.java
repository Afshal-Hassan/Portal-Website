package com.web.Model;

public class TeacherData {

    private String teacherName;
    private int teacherNo;
    private String teacherQualification;


    public void setTeacherName(String teacherName ){
        this.teacherName=teacherName;
    }


    public String getTeacherName(){
        return this.teacherName;
    }

    public void setTeacherNo(int teacherNo){
        this.teacherNo=teacherNo;
    }

    public int getTeacherNo(){
        return this.teacherNo;
    }

    public void setTeacherQualification(String teacherQualification){
        this.teacherQualification=teacherQualification;
    }
    public String getTeacherQualification(){
        return this.teacherQualification;
    }
}
