/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jinthu
 */
public class PostGraduateStudent extends Student{
    
    private String institute,qualificationType;
    private int yearOfCompletion,rank;
    private double gpa;
    
    public PostGraduateStudent(String indexNo, String name,String address, String nic, String dob, String institute,String qualificationType,String gender,String course,int yearOfCompletion,String intake, int year,int rank,double gpa) {
        super(indexNo, name,address, nic, dob, intake, year,gender,course);
        this.institute = institute;
        this.qualificationType = qualificationType;
        this.yearOfCompletion = yearOfCompletion;
        this.rank = rank;
        this.gpa = gpa;
    }//constructor
    
    public String getInstitute(){
        return institute;
    }
    
    public String getQualificationType(){
        return qualificationType;
    }
    public int getYearOfCompletion(){
        return yearOfCompletion;
    }
    
    public int getRank(){
        return rank;
    }
    
    public double getGpa(){
        return gpa;
    }
    
    
    
}//main class
