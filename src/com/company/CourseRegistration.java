package com.company;

public class CourseRegistration {
    private Student student;
    private Course course;
    private String registration_date;
    private String registration_time;

    public CourseRegistration(Student student, Course course, String registration_date, String registration_time) {
        this.student = student;
        this.course = course;
        this.registration_date = registration_date;
        this.registration_time = registration_time;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

}
