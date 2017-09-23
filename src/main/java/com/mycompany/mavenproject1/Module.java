/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 14502723
 */
public class Module {
    
    private String module_name;
    private String module_id;
    private List<String> students;
    
    public Module(String modname, String modID){
        
        this.module_name = modname;
        this.module_id = modID;
        students = new ArrayList<String>();
    
    }
}
