package com.company;

public class Course {
    private String courseCode;
    private String CourseName;
    private int ECTS;
    private int courseID;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public int getECTS() {
        return ECTS;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public Course(String courseCode, String courseName, int ECTS, int courseID) {
        this.courseCode = courseCode;
        CourseName = courseName;
        this.ECTS = ECTS;
        this.courseID = courseID;
    }

    @Override
    public String toString() {
        return ("courseCode=" + courseCode +
                ", CourseName='" + CourseName + '\'' +
                ", ECTS=" + ECTS +
                "\n");
    }
}
