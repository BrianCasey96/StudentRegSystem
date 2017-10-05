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
import org.joda.time.DateTime;
/**
 *
 * @author 14502723
 */
public class CourseProgramme {
    
    private String courseName;
    private List<Module> modules;
    public DateTime startDate;
    public DateTime endDate;
    
    public CourseProgramme(String cName, DateTime sDate, DateTime eDate){        
        this.courseName = cName; 
        this.startDate = sDate;
        this.endDate = eDate;
        this.modules = new ArrayList<Module>();
    }
   
    public void addModule(Module m1){
        modules.add(m1);
    }
    
    public List<Module> getModules(){
        return modules;
    }
}