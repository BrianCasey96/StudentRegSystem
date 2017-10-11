package com.mycompany;

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
   @Override 
  public String toString(){
      return this.name;
  }
}
