package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Instructor extends User{
    private String officePhone;
    private String employmentType;//prof or asist prof
    ArrayList<Course> taughtCourses=new ArrayList<>();// kurs eklemek için method yazabilirsin

    public Instructor(int userID, String name, String surname, String birhdate, String gender, String phonenumber, String loginEmail, String password, String officePhone, String employmentType) {
        super(userID, name, surname, birhdate, gender, phonenumber, loginEmail, password);
        this.officePhone = officePhone;
        this.employmentType = employmentType;
    }


    @Override
    public String toString() {
        return "Instructor Type :"+employmentType+"    Name :"+getName()+" "+getSurname()+"    Birthdate :"+getBirhdate()+"   Gender :"+getGender()+" Phone Number: "+getPhonenumber();
    }

    @Override
    public void listAllCourses(List<CourseRegistration> registrations) {

        // hashset oluştur
        HashSet<Course> hashSet = new HashSet<>();

//INSTRUCTORU PRINTLEYEN KISIM
        for (int i = 0; i < registrations.size(); i++) {
            for (int j = 0; j < taughtCourses.size(); j++) {
                if(registrations.get(i).getCourse().getCourseID() == this.taughtCourses.get(j).getCourseID()){
                    hashSet.add(registrations.get(i).getCourse());
                }
            }
        }
        System.out.println(hashSet);


     for (int i = 0; i < taughtCourses.size(); i++) {
         System.out.println("Attendance list for course: " + registrations.get(i).getCourse().getCourseName());
         for (int j = 0; j < registrations.size(); j++) {
             if (registrations.get(j).getCourse().getCourseName() == this.taughtCourses.get(i).getCourseName()) {
                 System.out.println(registrations.get(j).getStudent().getName()+" "+registrations.get(j).getStudent().getSurname());
             }
         }
     }

    }
}
