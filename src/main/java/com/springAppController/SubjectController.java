package com.springAppController;

import com.SpringAppservice.SubjectService;
import com.springApp.bean.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubjectController {
    @Autowired
    public SubjectService subService;
    @RequestMapping(method=RequestMethod.GET,value="/subjects")
    public List<Subject> getAllSubjects(){
        System.out.println("entered");
        return subService.getAllSubjects();
    }
    @RequestMapping(method= RequestMethod.POST, value="/subjects")
    public void addSubject(@RequestBody Subject subject){
        subService.addSubject(subject);
    }
    @RequestMapping(method= RequestMethod.PUT, value="/updatesubject/{id}")
    public void updateSubject(@PathVariable String id,@RequestBody Subject subject){
        subService.updateSubject(subject,id);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/deletesubject/{id}")
    public void deleteSubject(@PathVariable String id,@RequestBody Subject subject){
        subService.deleteSubject(subject,id);
    }
}
