package com.zc.controller;

import com.zc.pojo.Student;
import com.zc.service.StudentService;
import com.zc.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName MyController
 * @Description TODO
 * @Author 周超
 * @Date 2020/3/26 20:37
 * @Version 1.0
 **/
@Controller
public class MyController {
@Autowired
    private StudentService studentService;

@RequestMapping("/hello")
    public String hello(){
    return "hello";
}
@RequestMapping("hi")
    public void hi(HttpServletResponse response) throws IOException {
    response.getWriter().print("hi");
}
@RequestMapping("/student/{id}")
    public ModelAndView queryStudent(@PathVariable("id") int  id){
    ModelAndView mav=new ModelAndView("student");
    mav.addObject("student",studentService.selStudentByID(id));
    return mav;
}
@RequestMapping("/student/{name}/{age}")
    public void addStudent(@PathVariable("name") String name,@PathVariable("age") int age,HttpServletResponse response) throws IOException {
    Student student= new Student();
    student.setName(name);
    student.setAge(age);
    int i=studentService.addStudent(student);
    if(i>0){
        response.getWriter().print("添加成功");
    }else {
        response.getWriter().print("添加失败");
    }
}
}
