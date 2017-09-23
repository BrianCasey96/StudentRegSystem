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
public class Student {
    
  private String name;
  private int age;
  private String dob;
  private String username;
  
  public Student(String nm, int a, String db){
      this.name = nm;
      this.age = a;
      this.dob =db;
      this.username = getUsername();
  }
    
  public String getUsername(){
      return getName() + getAge();
  }
  
  public String getName(){
      return name;
  }
  
  public int getAge(){
      return age;
  }
}
