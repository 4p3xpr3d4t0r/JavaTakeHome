/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jinthu
 */
public class Student {

    
    
    private String dob,intake,address,nic,indexNo,name,gender,course;
    private int year;
    
    public Student(String indexNo,String name,String address,String nic,String dob,String intake,int year,String gender,String course){
        
        this.indexNo = indexNo;
        this.year = year;
        this.name = name;
        this.nic = nic;
        this.dob = dob;
        this.intake =  intake;
        this.address = address;
        this.gender = gender;
        this.course = course;
    
    }//constructor
    
    public String getGender(){
        return gender;
    }
    
    public String getCourse(){
        return course;
    }
    
    public String getIndexNo(){
        return indexNo;
        
    }
    public String getName(){
        return name;
        
    }
    
    public String getAddress(){
        return address;
        
    }
    public String getNic(){
        return nic;
        
    }
    public String getDob(){
        return dob;
        
    }
    public String getIntake(){
        return intake;
        
    }
    public int getYear(){
        return year;
        
    }
    
    
 }// main class
