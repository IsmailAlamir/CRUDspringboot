package com.example.crud.Web;


import com.example.crud.Domain.Subject;
import com.example.crud.Repository.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class subjectController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/subjects")
    public List<Subject> getAllSubject(){

        return subjectService.getAllSubjects();
    }

    @PostMapping("/subjects")
    public void addSubject(@RequestBody Subject subject){
        subjectService.addSubject(subject);

    }

    @PutMapping("/subjects/{id}")
    public void updateSubject(@PathVariable int id ,@RequestBody Subject subject){
        subjectService.updateSubject(id, subject);

    }

    @DeleteMapping("/subjects/{id}")
    public void deleteSubject(@PathVariable int id){
        subjectService.deleteSubject(id);

    }

}
