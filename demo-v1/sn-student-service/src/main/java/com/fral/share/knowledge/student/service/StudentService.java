package com.fral.share.knowledge.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.fral.share.knowledge.student.domain.Student;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private List<Student> studentsCollection;


    public StudentService() {
        studentsCollection = new ArrayList<>();
        initializeStudentsInformation();
    }

    
    public List<Student> getAllStudents() {        
        return studentsCollection;
    }


    private void initializeStudentsInformation() {
         //
         UUID francoId = UUID.fromString("4bdf3e86-e02a-11ea-87d0-0242ac130003");
         UUID juanId = UUID.fromString("4bdf4174-e02a-11ea-87d0-0242ac130003");
         UUID claudiaId = UUID.fromString("4bdf4610-e02a-11ea-87d0-0242ac130003");

         Student franco = new Student();
         franco.setId(francoId);
         franco.setCode("UMSS-987654321");
         franco.setName("Franco");
         franco.setLastName("Arratia");

         Student juan = new Student();
         juan.setId(juanId);
         juan.setCode("UMSS-9517534682");
         juan.setName("Juan");
         juan.setLastName("Perez");

         Student claudia = new Student();
         claudia.setId(claudiaId);
         claudia.setCode("UMSS-321654987");
         claudia.setName("Claudia");
         claudia.setLastName("Gutierrez");


         studentsCollection.add(franco);
         studentsCollection.add(juan);
         studentsCollection.add(claudia);
    }
}