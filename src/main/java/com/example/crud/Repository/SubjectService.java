package com.example.crud.Repository;

import com.example.crud.Domain.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {

    @Autowired
    public SubjectRepositroy subjectRepositroy;

    public List<Subject> getAllSubjects(){

        List<Subject> subjects = new ArrayList<>();
        subjectRepositroy.findAll().forEach(subjects::add);
        return subjects;

    }

    public void addSubject(Subject subject) {
        subjectRepositroy.save(subject);
    }

    public void updateSubject(int id, Subject subject) {

        Optional<Subject> optionalSubject = subjectRepositroy.findById(id);
        if (optionalSubject.isPresent()) {
            Subject oldSubject = optionalSubject.get();
            oldSubject.setName(subject.getName());
            subjectRepositroy.save(oldSubject);
        } else {
            throw new RuntimeException("Subject not found with id: " + id);
        }
    }

    public void deleteSubject(int id) {

        subjectRepositroy.deleteById(id);
    }
}
