package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{
    @Override
    public String toString() {
        return "Student : " +
                "StudentID : " + studentID +
                ", Name : " + getName() +" Birthdate : "+ getBirhdate();
    }

    private int studentID;
    private int yearsOfStudy;

    public Student(int userID, String name, String surname, String birhdate, String gender, String phonenumber, String loginEmail, String password, int studentID, int yearsOfStudy) {
        super(userID, name, surname, birhdate, gender, phonenumber, loginEmail, password);
        this.studentID = studentID;
        this.yearsOfStudy = yearsOfStudy;
    }


    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getYearsOfStudy() {
        return yearsOfStudy;
    }

    public void setYearsOfStudy(int yearsOfStudy) {
        this.yearsOfStudy = yearsOfStudy;
    }

    public int calculateTotalECTS(List<CourseRegistration> registrations) {
        int totalECTS = 0;
        for (int i = 0; i < registrations.size(); i++) {

            if (registrations.get(i).getStudent().studentID == this.studentID) {
                totalECTS = totalECTS + registrations.get(i).getCourse().getECTS();
            }
        }
        return totalECTS;
    }

    @Override
    public void listAllCourses(List<CourseRegistration> registrations) {
        System.out.println("Courses Taken:");
        for (int i = 0; i < registrations.size(); i++) {
            if(registrations.get(i).getStudent().studentID == this.studentID){
                System.out.print((registrations.get(i).getCourse()));
            }
        }
    }
}