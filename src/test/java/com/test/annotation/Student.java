package com.test.annotation;

import com.test.annotation.StudentGender.Gender;

@Persion(name="zhangsw",age=26,hobby={"test1","test2"})
public class Student {

	@StudentGender(gender=Gender.BOY)
    private String stuGender;


    public String getStuGender() {
        return stuGender;
    }
    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }
}
