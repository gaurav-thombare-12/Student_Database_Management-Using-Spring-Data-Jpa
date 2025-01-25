package com.gaurav.Student_Database_Management.Using.Spring.Data.Jpa.repository;


import com.gaurav.Student_Database_Management.Using.Spring.Data.Jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
// it will work even if we dont mention @Repository annotation but its not a good practice
// its a marker interface
//->A marker interface is typically an interface with no methods or fields,
// used to indicate a specific property or behavior of a class.
public interface StudentRepository extends JpaRepository<Student,Integer>
{

}
