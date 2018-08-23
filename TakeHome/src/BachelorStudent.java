/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jinthu
 */
public class BachelorStudent extends Student{
    
    private String faculty,rankOfAl,streamOfAl;
    private int phoneNo,rank;
    private double gpa;
    public BachelorStudent(String indexNo, String name, String address, String nic, String dob, String gender, String course, String intake, int year,String faculty,String rankOfAl,String streamOfAl,int phoneNo,int rank,double gpa) {
        super(indexNo, name, address, nic, dob, intake, year, gender, course);
        this.faculty = faculty;
        this.rankOfAl = rankOfAl;
        this.streamOfAl = streamOfAl;
        this.phoneNo = phoneNo;
        this.rank = rank;
        this.gpa = gpa;
        
    }
    
    public String getFaculty(){
        return faculty;
    }
    
    public String getRankOfAl(){
        return rankOfAl;
    }
    
    public String getStreamOfAl(){
        return streamOfAl;
    }
    
    public int getPhoneNo(){
        return phoneNo;
    }
    
    public int getRank(){
        return rank;
    }
    
    public  double getGpa(){
        return gpa;
    }
    
}
