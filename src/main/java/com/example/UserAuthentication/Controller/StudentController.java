package com.example.UserAuthentication.Controller;

import com.example.UserAuthentication.Entity.Student;
import com.example.UserAuthentication.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins= "*")
@RequestMapping("api/v1/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping(value= "/save")
    public String saveStudent(@RequestBody Student students)
    {
        studentService.save_Update(students);
        return  students.get_id();
    }

    @GetMapping(value= "/getAll")
    public Iterable <Student>getStudents()
    {
        return studentService.listAll();
    }

    @PutMapping(value= "/edit/{id}")
    public Student update(@RequestBody Student student,@PathVariable(name="id") String _id)
    {
        student.set_id(_id);
        studentService.save_Update(student);
        return  student;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable("id") String _id)
    {
        studentService.deleteStudent(_id);
    }

//    @RequestMapping("/student/{id}")
//    private Student getStudent(@PathVariable(name="id") String studentid)
//    {
//        return studentService.getStudentById(studentid);
//    }
}
