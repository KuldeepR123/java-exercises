package com.example.kuldeep;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Collage{
    String collageName;
    List<Course> courses;
    public String getCollageName(){
        return collageName;
    }
    public List<Course> getCourses(){
        return courses;
    }
    public Collage(String collageName,List<Course> courses){
        this.collageName = collageName;
        this.courses = courses;
    }
}
class Course{
     String courseName;
     List<Students> enrolledStudents;
     public String getCourseName(){
         return courseName;
     }
     public Course(String cName, List<Students> enrolledStudents){
         this.courseName = cName;
         this.enrolledStudents = enrolledStudents;
     }
}
class Students{
     String name;
     String course;
     String college;
     public Students(String name, String course, String college){
         this.name = name;
         this.course = course;
         this.college = college;
     }
     public void setCourse(String course){
         this.course = course;
     }
     public void setCollege(String college){
         this.college = college;
     }
     public String getName(){
         return name;
     }
     public String getCourse(){
         return course;
     }
     public String getCollage(){
         return college;
     }
}
public class CollectionExercise1 {
     public static void main(String[] args){
         List<Students> students  = new ArrayList<>();
         students.add(new Students("Kuldeep","",""));
         students.add(new Students("Yash","",""));
         students.add(new Students("Ankit","",""));
         students.add(new Students("Niraj","",""));

         List<Course> course = new ArrayList<>();
         course.add(new Course("EC",students));
         course.add(new Course("IC",students));
         course.add(new Course("Computer",students));
         course.add(new Course("IT",students));

         List<Collage> clg = new ArrayList<>();
         clg.add(new Collage("GECR",course));
         clg.add(new Collage("VVP",course));
         clg.add(new Collage("Marwadi University",course));
         clg.add(new Collage("Darshan University",course));

         for(Collage c: clg){
             System.out.print(c.collageName + " : ");
             for(Course cs:c.courses){
                 System.out.print(cs.courseName + " : ");
                 for(Students s:cs.enrolledStudents){
                     System.out.print(s.name + " : ");
                 }
                 System.out.println();
             }
         }
         List<Collage> str = (List<Collage>) Stream.of(clg, course, students).flatMap(Collection::stream).collect(Collectors.toList());
         str.sort(Collections.reverseOrder());
         System.out.println(str);
     }
}
