/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

/**
 *
 * @author I330151
 */
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 14502723
 */
public class Module {
    
    private String module_name;
    private String module_id;
    private List<Student> students;
    
    public Module(String modname, String modID){
        
        this.module_name = modname;
        this.module_id = modID;
        students = new ArrayList<Student>();
    }
    
    public void addStudent(Student s1){
        students.add(s1);
    }
    
     public List<Student> getStudents(){
        return students;
    }
    
     @Override
     public String toString(){
         return this.module_name;
     }
     
}
