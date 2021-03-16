package com.SpringAppservice;

import com.springApp.bean.Subject;
import com.springApprepository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {
    @Autowired
    public SubjectRepository subjectRepo;
    public List<Subject> getAllSubjects(){
        List<Subject> list=new ArrayList<>();
        subjectRepo.findAll().forEach(list::add);
        return list;
    }
    public void addSubject(Subject subject){
        subjectRepo.save(subject);
    }
    public void updateSubject(Subject subject,String id){
        subjectRepo.save(subject);
    }
    public void deleteSubject(Subject subject,String id){
        subjectRepo.deleteById(id);
    }
}
