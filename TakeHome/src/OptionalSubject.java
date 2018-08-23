/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jinthu
 */
public class OptionalSubject {
    String title,name;
    int credit,semesterNo;
    
    OptionalSubject(String title,String name,int credit,int semesterNo){
        this.title = title;
        this.name = name;
        this.credit = credit;
        this.semesterNo = semesterNo;
    }//constructor
    
    String getTitle(){
        return title;
    }
    
    String getName(){
        return name;
    }
    
    int getCredit(){
        return credit;
    }
    
    int getSemesterNo(){
        return semesterNo;
    }
    
}
