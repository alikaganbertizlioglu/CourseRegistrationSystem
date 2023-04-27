package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(1,"Tristian", "Wilkins", "11/08/1995", "Male", "777 961-3377", "tristianwilkins@courseregistrations.com", "003CAAC7050C",100,3);
        Student student2 = new Student(2,"Brett", "Frey", "31/12/1995", "Male", "778 236-7485", "brettfrey@courseregistrations.com", "426B5A204169",1,201);
        Student student3 = new Student(3,"Cordell", "Monroe", "22/01/2002", "Male", "983 758-6334", "cordellmonroe@courseregistrations.com", "38BD81C40A96",302,4);
        Student student4 = new Student(4,"Ezra", "Delgado", "03/11/2003", "Male", "255 925-9312", "ezradelgado@courseregistrations.com", "6D99BEEC3AB6",403,4);
        Student student5 = new Student(5,"Marcus", "Guzman", "13/10/2003", "Male", "958 318-3821", "marcusguzman@courseregistrations.com", "565A9CA2E136",504,4);
        Student student6 = new Student(6,"Juan", "Mayweather", "21/10/2000", "Male", "982 339-6441", "juanmay@courseregistrations.com", "E68B39EB909C",605,4);
        Student student7 = new Student(7,"Ernesto", "Ware", "02/11/2002", "Male", "971 987-9067", "ernestoware@courseregistrations.com", "79B676459B5C",706,1);
        Student student8 = new Student(8,"Reilly", "Morrow", "07/06/1996", "Male", "328 424-0881", "reillymorrow@courseregistrations.com", "13705253E668",807,4);
        Student student9 = new Student(9,"Caiden", "Gregory", "19/07/2001", "Male", "455 737-6437", "caidengregory@courseregistrations.com", "434EA12DA42C",908,3);
        Student student10 = new Student(10,"Irvin", "Rhodes", "26/01/2003", "Male", "259 361-8382", "irvinrhodes@courseregistrations.com", "C4E352EEECCE",1009,2);
        Student student11 = new Student(11,"Alberto", "Castaneda", "09/03/2001", "Male", "778 244-8079", "albertocastaneda@courseregistrations.com", "3170A014DC42",1110,3);
        Student student12 = new Student(12,"Harrison", "Abbott", "30/09/1998", "Male", "852 849-6600", "harrisonabbott@courseregistrations.com", "BD5C2E4A471A",1211,1);
        Student student13 = new Student(13,"Elyse", "Mcpherson", "26/04/2000", "Female", "609 870-3384", "elysemcpherson@courseregistrations.com", "72D2DADAC577",3112,2);
        Student student14 = new Student(14,"Shyanne", "Woodard", "08/12/2002", "Female", "795 502-5640", "shyannewoodard@courseregistrations.com", "D17D20B566DB",1413,1);
        Student student15 = new Student(15,"Karlee", "Hester", "15/10/2001", "Female", "266 810-4239", "karleehester@courseregistrations.com", "2B0B8CDEB032",1514,1);
        Student student16 = new Student(16,"Lizbeth", "Gray", "11/05/1996", "Female", "591 483-0805", "lizbethgray@courseregistrations.com", "A19A2BCD8284",1165,4);
        Student student17 = new Student(17,"Fatima", "Anthony", "29/09/2003", "Female", "932 262-3524", "fatimaanthony@courseregistrations.com", "4D96C1CD6015",1816,2);
        Student student18 = new Student(18,"Ashley", "Ryan", "01/09/1999", "Female", "215 207-6905", "ashleyryan@courseregistrations.com", "0492C0BC0EC2",1107,1);
        Student student19 = new Student(19,"Alivia", "Morse", "30/12/2001", "Female", "410 399-1687", "aliviamorse@courseregistrations.com", "78633209CC4E",1018,2);
        Student student20 = new Student(20,"Sonia", "Wiley", "10/07/2001", "Female", "457 679-2312", "soniawiley@courseregistrations.com", "468ED0D3DC68",119,1);
        Student student21 = new Student(21,"Sasha", "Romero", "23/06/1995", "Female", "559 407-0240", "sasharomero@courseregistrations.com", "5DE058A37A9D",1260,1);
        Student student22 = new Student(22,"Vivian", "Mclaughlin", "25/05/1997", "Female", "630 439-2855", "vivianmclaughlin@courseregistrations.com", "78E697912E9C",1221,3);
        Student student23 = new Student(23,"Baylee", "Stevenson", " 15/11/1997", "Female", "430 540-4650", "bayleestevenson@courseregistrations.com", "B4974E05B859",1242,4);
        Student student24 = new Student(24,"Alannah", "Clark", "17/09/1995", "Female", "501 466-1016", "alannahclark@courseregistrations.com", "BBBE6AE88415",1235,4);
        Student student25 = new Student(25,"Ali Kağan", "Bertizlioğlu", "28/08/2001", "Male", "507 645-4333", "alikaganbertizlioglu@gmail.com", "35password35",19071027,2);


        Course course1= new Course("CE 1100","Introduction to Programming",5,1);
        Course course2= new Course("CE 1200","Data Structures",7,2);
        Course course3= new Course("CE 1300","Database Systems",6,3);
        Course course4= new Course("CE 1400","Software Engineering",4,4);
        Course course5= new Course("CE 1500","Web Development",3,5);
        Course course6= new Course("CE 1600","Mobile Software Development",4,6);

        ArrayList <Course> courseArrayList= new ArrayList<>();
        courseArrayList.add(course1);
        courseArrayList.add(course2);
        courseArrayList.add(course3);
        courseArrayList.add(course4);
        courseArrayList.add(course5);
        courseArrayList.add(course6);



        ArrayList<Student> studentArrayList = new ArrayList<>();

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);
        studentArrayList.add(student6);
        studentArrayList.add(student7);
        studentArrayList.add(student8);
        studentArrayList.add(student9);
        studentArrayList.add(student10);
        studentArrayList.add(student11);
        studentArrayList.add(student12);
        studentArrayList.add(student13);
        studentArrayList.add(student14);
        studentArrayList.add(student15);
        studentArrayList.add(student16);
        studentArrayList.add(student17);
        studentArrayList.add(student18);
        studentArrayList.add(student19);
        studentArrayList.add(student20);
        studentArrayList.add(student21);
        studentArrayList.add(student22);
        studentArrayList.add(student23);
        studentArrayList.add(student24);
        studentArrayList.add(student25);

        // öğrenci sayısı kadar basıyor

        CourseRegistration courseRegistration1 = new CourseRegistration(student1,course1,"30.03.2022","01:45");
        CourseRegistration courseRegistration8 = new CourseRegistration(student1,course3,"30.03.2022","01:45");
        CourseRegistration courseRegistration2 = new CourseRegistration(student2,course4,"30.03.2022","01:45");
        CourseRegistration courseRegistration3 = new CourseRegistration(student3,course2,"30.03.2022","01:45");
        CourseRegistration courseRegistration4 = new CourseRegistration(student4,course6,"30.03.2022","01:45");
        CourseRegistration courseRegistration5 = new CourseRegistration(student5,course2,"30.03.2022","01:45");
        CourseRegistration courseRegistration6 = new CourseRegistration(student6,course3,"30.03.2022","01:45");
        CourseRegistration courseRegistration7 = new CourseRegistration(student7,course5,"30.03.2022","01:45");
        CourseRegistration courseRegistration9 = new CourseRegistration(student2,course1,"30.03.2022","01:45");
        CourseRegistration courseRegistration10 = new CourseRegistration(student5,course3,"30.03.2022","01:45");
        CourseRegistration courseRegistration11 = new CourseRegistration(student6,course4,"30.03.2022","01:45");


        // kursları aç

        List<CourseRegistration> registrations= new ArrayList<>();

        registrations.add(courseRegistration1);
        registrations.add(courseRegistration2);
        registrations.add(courseRegistration3);
        registrations.add(courseRegistration4);
        registrations.add(courseRegistration5);
        registrations.add(courseRegistration6);
        registrations.add(courseRegistration8);
        registrations.add(courseRegistration7);
        registrations.add(courseRegistration9);
        registrations.add(courseRegistration10);
        registrations.add(courseRegistration11);



        Instructor instructor1= new Instructor(26,"Derrick","Mcguire","12/09/1981","Male","(452) 449-4697","derrickmcguire@courseregistrations.com","2JzxyEjBSUlt2gF3","(353) 277-4307","Professor");
        Instructor instructor2= new Instructor(27,"Collin","Owen","25/10/1988","Male","(452) 873-6694","collinowen@courseregistrations.com","GCBHe68jT72f4jtr","(212) 905-1176","Ast. Professor");
        Instructor instructor3= new Instructor(28,"Whitney","Reid","01/02/1992","Female","(452) 511-9657","whitneyreid@courseregistrations.com","WCXRB8L3X0345v5B","(485) 377-7723","Ast. Professor");


        instructor1.taughtCourses.add(course1);
        instructor1.taughtCourses.add(course3);
        instructor2.taughtCourses.add(course2);
        instructor2.taughtCourses.add(course4);
        instructor3.taughtCourses.add(course5);
        instructor3.taughtCourses.add(course6);


        System.out.println("***************STUDENT.JAVA'S EXAMPLE OUTPUT STARTS******************");
        for (int i = 0; i < 5; i++) {// BEN THOUGHT THAT 5 STUDENT IS ENOUGH TO SHOW MY CODE WORKS FINE
            System.out.println(studentArrayList.get(i).toString());
            studentArrayList.get(i).listAllCourses(registrations);
            System.out.println("Total ECTS : "+studentArrayList.get(i).calculateTotalECTS(registrations));
        }
        System.out.println("***************STUDENT.JAVA'S EXAMPLE OUTPUT ENDS******************\n");


        System.out.println(instructor2.toString());
        instructor2.listAllCourses(registrations);
        System.out.println(instructor3.toString());
        instructor3.listAllCourses(registrations);
        System.out.println("\n***************INSTRUCTOR.JAVA'S EXAMPLE OUTPUT STARTS******************\n");

        System.out.println(instructor1.toString());
        instructor1.listAllCourses(registrations);
        System.out.println("***************INSTRUCTOR.JAVA'S EXAMPLE OUTPUT ENDS******************");

    }
}
