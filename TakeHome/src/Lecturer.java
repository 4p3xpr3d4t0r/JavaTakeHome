/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jinthu
 */
public class Lecturer {
    private String indexNo,name,address,nic,dob,room,faculty,gender;
    private int phoneNo;
    
    
    public Lecturer(String indexNo,String name,String address,String nic,String dob,String room,String faculty,String gender,int phoneNo){
        this.indexNo = indexNo;
        this.name = name;
        this.address = address;
        this.nic = nic;
        this.dob = dob;
        this.room = room;
        this.faculty = faculty;
        this.gender = gender;
        this.phoneNo = phoneNo;
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
    public String getRoom(){
        return room;
    }
    public String getFaculty(){
        return faculty;
    }
    public String getGender(){
        return gender;
    }
    public int getPhoneNo(){
        return phoneNo;
    }
    
    
    
}
