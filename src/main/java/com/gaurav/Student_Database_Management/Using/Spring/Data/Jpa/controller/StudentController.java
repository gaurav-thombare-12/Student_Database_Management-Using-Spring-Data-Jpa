package com.gaurav.Student_Database_Management.Using.Spring.Data.Jpa.controller;


import com.gaurav.Student_Database_Management.Using.Spring.Data.Jpa.entity.Student;
import com.gaurav.Student_Database_Management.Using.Spring.Data.Jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/sdm")
public class StudentController {

    @Autowired
    private StudentService service;

    // Storing Data in StudentDB
    @PostMapping("/save")
    public Student createStudent(@RequestBody Student student)
    {
        return service.saveStudent(student);
    }

    //display all the data
    @GetMapping("/all")
    public List<Student> getAllStudentData(){
        List<Student> allStudentData = service.getAllStudentData();
        return allStudentData;
    }

    // display a particular record
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return service.getStudentById(id);
    }
    // either use @PathVariable or @RequestParam both works same
// display a particular record
    @GetMapping
    public Student getStudent_ById(@RequestParam Integer id){
    return service.getStudentById(id);
    }

// update the data By ID all the fields has to be updated else it will show null
    @PutMapping("/{id}")
    public Student updateStudentDataById(@PathVariable Integer id,@RequestBody Student student)
    {
        Student updatedStudent = service.updateStudentById(id, student);
        return updatedStudent;
    }

    // update the data By Id few fields that you want to update
    @PatchMapping("/{id}")
    public Student updateStudentDataById_fields(@PathVariable Integer id, @RequestBody Student student)
    {
    Student updatedStudentField = service.updateStudentDataById_fields(id,student);
    return updatedStudentField;
    }

    @DeleteMapping("/{id}")
    public String deleteStudentByID (@PathVariable Integer id)
    {
        String response = service.deleteStudentByID(id);
        return response;

    }

    // delete the all the data from student Database
    @DeleteMapping
    public String deleteAllData()
    {
        String response2 = service.deleteAllData();
        return response2;
    }

    


}
