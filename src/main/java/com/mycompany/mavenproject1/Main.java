/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author 14502723
 */
public class Main {
    
    
public static void main(String [ ] args){
    
    System.out.println("Hello");
    Student s1 = new Student("Ariel", 18, "20/07/1999");
    System.out.println(s1.getUsername());

        Student s2 = new Student("Anna", 21, "20/04/1996");
        Student s3 = new Student("Annabelle", 2, "20/07/2015");
        
        Module m1 = new Module("Software Engineering |||", "CT417");
        Module m2 = new Module("Artificial Intelligence", "CT421");
        Module m3 = new Module("Cryptography", "CS402");
        
        //CourseProgramme cp1 = new CourseProgramme("Computer Science and Information Technology");
    }
}
