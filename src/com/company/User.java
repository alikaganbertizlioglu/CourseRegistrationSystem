package com.company;
import java.util.List;

public abstract class User {
    private int UserID;//start from ID 1 and increase as the new users are added. ????*
    private String Name;
    private String Surname;
    private String birhdate;// gün-ay-yıl
    private String gender;//male or female
    private String phonenumber;
    private String loginEmail;
    private String password;

    public User(int userID, String name, String surname, String birhdate, String gender, String phonenumber, String loginEmail, String password) {
        UserID = userID;
        Name = name;
        Surname = surname;
        this.birhdate = birhdate;
        this.gender = gender;
        this.phonenumber = phonenumber;
        this.loginEmail = loginEmail;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserID=" + UserID +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", birhdate='" + birhdate + '\'' +
                ", gender='" + gender + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", loginEmail='" + loginEmail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getUserID() {
        return UserID;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getBirhdate() {
        return birhdate;
    }

    public String getGender() {
        return gender;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getLoginEmail() {
        return loginEmail;
    }

    public String getPassword() {
        return password;
    }

    public abstract void listAllCourses(List<CourseRegistration> registrations);

}
