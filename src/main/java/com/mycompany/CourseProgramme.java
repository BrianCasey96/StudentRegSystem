package com.mycompany;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

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