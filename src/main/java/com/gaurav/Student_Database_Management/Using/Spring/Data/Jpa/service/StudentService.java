package com.gaurav.Student_Database_Management.Using.Spring.Data.Jpa.service;

import com.gaurav.Student_Database_Management.Using.Spring.Data.Jpa.entity.Student;
import com.gaurav.Student_Database_Management.Using.Spring.Data.Jpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService {


//StudentRepository ke implementation hume nhi dikh rahi hai pr uski implementation hai
//jpa usko run time pr dega
// agar jpa implementation nahi deta toh we cant able to make object of interface
    @Autowired
StudentRepository studentRepository;


    // Storing Data in StudentDB
    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);
    }


    //display all the data
    public List<Student> getAllStudentData(){
        List<Student> list = studentRepository.findAll();
        return list;
    }

    // display a particular record
    public   Student getStudentById(Integer id){
        Optional<Student> byId = studentRepository.findById(id);
        Student student = byId.get();
        return student;
    }


    //update the student data by id
    public Student updateStudentById(Integer id,Student student){
        Optional<Student> studentById = studentRepository.findById(id);
        Student updateStudentSave = null;
        if(studentById.isPresent()){
            Student dbStudentObject = studentById.get();
            dbStudentObject.setAge(student.getAge());
            dbStudentObject.setCourse(student.getCourse());
            dbStudentObject.setEmail(student.getEmail());
            dbStudentObject.setName(student.getName());
           updateStudentSave= studentRepository.save(dbStudentObject);
        }
        else
        {
            System.out.println("Data not present in Database");
        }
    return updateStudentSave;
    }
// update some fields of Student Data 
    public Student updateStudentDataById_fields(Integer id , Student student)
    {
        Optional<Student> studentDataById = studentRepository.findById(id);
        Student updatedStudentFieldSave = null;
        if (studentDataById.isPresent()){
            Student dbStudentObject1 = studentDataById.get();
            // Update only non-null fields from the input student object
            if (student.getName() != null) {
                dbStudentObject1.setName(student.getName());
            }
            if (student.getEmail() != null) {
                dbStudentObject1.setEmail(student.getEmail());
            }
            if (student.getAge() != null) {
                dbStudentObject1.setAge(student.getAge());
            }
            if (student.getCourse() != null) {
                dbStudentObject1.setCourse(student.getCourse());
            }
            updatedStudentFieldSave=studentRepository.save(dbStudentObject1);
        }
        else{
            System.out.println("Data not present in Database");
        }
        return updatedStudentFieldSave;
    }


    // delete the student data by id from student record
    public String deleteStudentByID (Integer id)
    {
            studentRepository.deleteById(id);
            String data = ("Deleted data of id : "+id+"   successfully.....  :-)");
            return data;
    }


    // delete the all the data from student Database
    public String deleteAllData(){
        studentRepository.deleteAll();
        String res1 = ("Deleted all the records from database successfully....");
        return res1;
    }


}

