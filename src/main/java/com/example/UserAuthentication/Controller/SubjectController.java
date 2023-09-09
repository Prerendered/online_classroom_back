package com.example.UserAuthentication.Controller;

import com.example.UserAuthentication.Entity.Subject;
import com.example.UserAuthentication.Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins= "*")
@RequestMapping("/api/v2/subjects")
public class SubjectController {
    
    @Autowired
    private SubjectService SubjectServices;

    @PostMapping(value= "/save")
    public String saveSubject(@RequestBody Subject Subjects)
    {
        SubjectServices.save_Update(Subjects);
        return Subjects.getSubjectName();
    }

    @GetMapping(value= "/getAll")
    public Iterable <Subject>getSubjects()
    {
        return SubjectServices.listAll();
    }


    @PutMapping(value= "/edit/{id}")
    public Subject update(@RequestBody Subject Subject,@PathVariable(name="id") String _id)
    {
        Subject.set_id(_id);
        SubjectServices.save_Update(Subject);
        return  Subject;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSubject(@PathVariable("id") String _id)
    {
        SubjectServices.deleteSubject(_id);
    }

   @RequestMapping("/search/{id}")
   private Subject getSubject(@PathVariable(name="id") String Subjectid)
   {
       return SubjectServices.getSubjectById(Subjectid);
   }
    
}
