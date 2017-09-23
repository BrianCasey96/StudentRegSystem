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
import java.time.LocalDate;
/**
 *
 * @author 14502723
 */
public class CourseProgramme {
    
    private String courseName;
    private List<String> modules;
    private LocalDate startDate;
    private LocalDate endDate;
    
    //start date 
    //end date
    //joda Time classes, added as a dependancy
    
    public CourseProgramme(String cName, LocalDate sDate, LocalDate eDate){
        
        this.courseName = cName; 
        this.startDate = sDate;
        this.endDate = eDate;
        modules = new ArrayList<String>();
    }
}