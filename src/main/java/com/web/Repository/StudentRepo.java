package com.web.Repository;

import com.web.Model.StudentData;

public class StudentRepo {

    String stdSavedData;

    public void saveStudent(String stdSavingData){
        this.stdSavedData=stdSavingData;
        System.out.println(stdSavedData);
    }

}
