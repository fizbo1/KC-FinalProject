package com.example.myapplicationfinal;

public class Student {

    private String studentname;
    private String studentAge;

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentPhoto() {
        return studentPhoto;
    }

    public void setStudentPhoto(int studentPhoto) {
        this.studentPhoto = studentPhoto;
    }

    private int studentPhoto;

    public Student(String studentname, String studentAge, int studentPhoto) {
        this.studentname = studentname;
        this.studentAge = studentAge;
        this.studentPhoto = studentPhoto;
    }
}
