package com.gaurav.Student_Database_Management.Using.Spring.Data.Jpa.entity;


import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    //@Column(name = "F_Name")
    //this will rename the column "name" with "F_Name"  in database
    // for java operation we can use 'name' as it is
    // but when ever the name takes part in persistence logic
    // JPA will use F_Name to communicate with DataBase
    // this whole process is called as Alias
    private String name;
    private String email;
    private String course;
    private Integer age;

    Student(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, String email, String course, Integer age) {
        this.name = name;
        this.email = email;
        this.course = course;
        this.age = age;
    }


}
