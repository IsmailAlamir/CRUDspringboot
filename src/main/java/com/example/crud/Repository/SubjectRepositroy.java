package com.example.crud.Repository;

import com.example.crud.Domain.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepositroy extends CrudRepository<Subject, Integer> {
}
