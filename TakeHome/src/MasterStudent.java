/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jinthu
 */
public class MasterStudent extends Student{
    
    private String faculty,rankOfAl,streamOfAl;
    private int phoneNo;
    public MasterStudent(String indexNo, String name, String address, String nic, String dob, String gender, String course, String intake, int year,String faculty,String rankOfAl,String streamOfAl,int phoneNo) {
        super(indexNo, name, address, nic, dob, intake, year, gender, course);
        this.faculty = faculty;
        this.rankOfAl = rankOfAl;
        this.streamOfAl = streamOfAl;
        this.phoneNo = phoneNo;
        
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
    
}
