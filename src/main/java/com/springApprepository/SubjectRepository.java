package com.springApprepository;

import com.springApp.bean.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject,String> {
}
